package com.example.formationmai.soccerMai.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formationmai.soccerMai.models.Matche;
import com.example.formationmai.soccerMai.repositories.MatchRepository;
import com.example.formationmai.soccerMai.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService{

	@Autowired
	public MatchRepository matchRepo;
	
	@Override
	public List<Matche> getAllMatches() {
		
		return matchRepo.findAll();
	}

	@Override
	public Matche getMatchById(Long id) {
		
		Optional<Matche> m = matchRepo.findById(id);
		return m.isPresent() ? m.get() : null; 
	}

	@Override
	public Matche addMatch(Matche m) {
		
		return matchRepo.save(m);
	}

	@Override
	public Matche updateMatch(Matche m) {
		
		return matchRepo.save(m);
	}

	@Override
	public void deleteMatchById(Long id) {
		
		matchRepo.deleteById(id);
	}

}
