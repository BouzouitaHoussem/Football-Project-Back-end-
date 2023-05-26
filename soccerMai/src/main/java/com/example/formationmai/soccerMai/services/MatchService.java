package com.example.formationmai.soccerMai.services;

import java.util.List;

import com.example.formationmai.soccerMai.models.Matche;

public interface MatchService {
	
	public List<Matche> getAllMatches();
	
	public Matche getMatchById(Long id);
	
	public Matche addMatch(Matche m);
	
	public Matche updateMatch(Matche m);
	
	public void deleteMatchById(Long id);

}
