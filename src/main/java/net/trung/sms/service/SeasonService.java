package net.trung.sms.service;

import java.util.List;

import net.trung.sms.entity.Season;

public interface SeasonService {
	List<Season> getAllSeasons();
	
	Season saveSeason(Season season);
	
	Season getSeasonById(Long id);
	
	Season updateSeason(Season season);
	
	void deleteSeasonById(Long id);
}
