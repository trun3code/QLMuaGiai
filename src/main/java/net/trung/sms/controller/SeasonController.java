package net.trung.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.trung.sms.entity.Season;
import net.trung.sms.service.SeasonService;

@Controller
public class SeasonController {
	
	private SeasonService seasonService;

	public SeasonController(SeasonService seasonService) {
		super();
		this.seasonService = seasonService;
	}
	
	@GetMapping("/seasons")
	public String listSeasons(Model model) {
		model.addAttribute("seasons", seasonService.getAllSeasons());
		return "seasons";
	}
	
	@GetMapping("/seasons/new")
	public String createSeasonForm(Model model) {
		
		Season season = new Season();
		model.addAttribute("season", season);
		return "create_season";
		
	}
	
	@PostMapping("/seasons")
	public String saveSeason(@ModelAttribute("season") Season season) {
		seasonService.saveSeason(season);
		return "redirect:/seasons";
	}
	
	@GetMapping("/seasons/edit/{id}")
	public String editSeasonForm(@PathVariable Long id, Model model) {
		model.addAttribute("season", seasonService.getSeasonById(id));
		return "edit_season";
	}

	@PostMapping("/seasons/{id}")
	public String updateSeason(@PathVariable Long id,
			@ModelAttribute("season") Season season,
			Model model) {
		
		Season existingSeason = seasonService.getSeasonById(id);
		existingSeason.setId(id);
		existingSeason.setName(season.getName());
		existingSeason.setTime(season.getTime());
		existingSeason.setLocation(season.getLocation());	
		seasonService.updateSeason(existingSeason);
		return "redirect:/seasons";		
	}
	
	
	@GetMapping("/seasons/{id}")
	public String deleteSeason(@PathVariable Long id) {
		seasonService.deleteSeasonById(id);
		return "redirect:/seasons";
	}
	
}
