package com.example.formationmai.soccerMai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.formationmai.soccerMai.models.Player;
import com.example.formationmai.soccerMai.services.PlayerService;


@RequestMapping("players")
@CrossOrigin("*")
@RestController
public class PlayerController {
	
	@Autowired
	public PlayerService playerService;
    
	@GetMapping
	public List<Player> getAll(){
	    return playerService.getAllPlayers();
	    
	    }
		
	    @GetMapping("/{id}")
		public Player getById(@PathVariable Long id) {
			
		return playerService.getPlayerById(id);
		}
	    
	    @DeleteMapping("/{id}")
		public void deleteById(@PathVariable Long id) {
			
	   	playerService.deletePlayerById(id);	
		}
		
	    @PostMapping
		public Player addPlayer(@RequestBody Player player) {

		return playerService.addPlayer(player);
	}
		@PutMapping
	    public Player editPlayer(@RequestBody Player p) {
		
			return playerService.updatePlayer(p);
		}
}
