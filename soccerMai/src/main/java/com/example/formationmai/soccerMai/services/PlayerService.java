package com.example.formationmai.soccerMai.services;

import java.util.List;

import com.example.formationmai.soccerMai.models.Player;



public interface PlayerService {
	
public List<Player> getAllPlayers();
	
	public Player getPlayerById(Long id);
	
	public Player addPlayer(Player p);
	
	public Player updatePlayer(Player p);
	
	public void deletePlayerById(Long id);

}
