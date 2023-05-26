package com.example.formationmai.soccerMai.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formationmai.soccerMai.models.Team;
import com.example.formationmai.soccerMai.repositories.TeamRepository;
import com.example.formationmai.soccerMai.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	public TeamRepository teamRepo;
	
	@Override
	public List<Team> getAllTeams() {
		
		return teamRepo.findAll();
	}

	@Override
	public Team getTeamById(Long id) {
		
		Optional<Team> t = teamRepo.findById(id);
		return t.isPresent() ? t.get() : null; 
	}

	@Override
	public Team addTeam(Team t) {
		
		return teamRepo.save(t);
	}

	@Override
	public Team updateTeam(Team t) {
		
		return teamRepo.save(t);
	}

	@Override
	public void deleteTeamById(Long id) {
		
		teamRepo.deleteById(id);
	}

}
