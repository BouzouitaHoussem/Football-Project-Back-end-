package com.example.formationmai.soccerMai.services;

import java.util.List;

import com.example.formationmai.soccerMai.models.Team;


public interface TeamService {
	
public List<Team> getAllTeams();
	
	public Team getTeamById(Long id);
	
	public Team addTeam(Team t);
	
	public Team updateTeam(Team t);
	
	public void deleteTeamById(Long id);

}
