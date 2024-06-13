package net.trung.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.trung.sms.entity.Season;
import net.trung.sms.repository.SeasonRepository;
import net.trung.sms.service.SeasonService;

@Service
public class SeasonServiceImpl implements SeasonService{

	private SeasonRepository seasonRepository;
	
	public SeasonServiceImpl(SeasonRepository seasonRepository) {
		super();
		this.seasonRepository = seasonRepository;
	}

	@Override
	public List<Season> getAllSeasons() {
		return seasonRepository.findAll();
	}

	@Override
	public Season saveSeason(Season season) {
		return seasonRepository.save(season);
	}

	@Override
	public Season getSeasonById(Long id) {
		return seasonRepository.findById(id).get();
	}

	@Override
	public Season updateSeason(Season season) {
		return seasonRepository.save(season);
	}

	@Override
	public void deleteSeasonById(Long id) {
		seasonRepository.deleteById(id);	
	}

}
