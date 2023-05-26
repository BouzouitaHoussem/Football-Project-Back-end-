package com.example.formationmai.soccerMai.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formationmai.soccerMai.models.Player;
import com.example.formationmai.soccerMai.repositories.PlayerRepository;
import com.example.formationmai.soccerMai.services.PlayerService;
@Service

public class PlayerServiceImpl implements PlayerService {

	@Autowired
	public PlayerRepository playerRepo;
	
	@Override
	public List<Player> getAllPlayers() {
		
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayerById(Long id) {
		
		Optional<Player> p = playerRepo.findById(id);
		return p.isPresent() ? p.get() : null; 
	}

	@Override
	public Player addPlayer(Player p) {
		
		return playerRepo.save(p);
	}

	@Override
	public Player updatePlayer(Player p) {
		
		return playerRepo.save(p);
	}

	@Override
	public void deletePlayerById(Long id) {
		
		playerRepo.deleteById(id);
		
	}

}
