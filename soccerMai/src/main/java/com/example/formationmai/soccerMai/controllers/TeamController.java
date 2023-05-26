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

import com.example.formationmai.soccerMai.models.Team;
import com.example.formationmai.soccerMai.services.TeamService;


@RequestMapping("teams")
@CrossOrigin("*")
@RestController
public class TeamController {

	
	@Autowired
	public TeamService teamService;
	
	@GetMapping
	public List<Team> getAll(){
	    return teamService.getAllTeams();
	    
	    }
		
	    @GetMapping("/{id}")
		public Team getById(@PathVariable Long id) {
			
		return teamService.getTeamById(id);
		}
	    
	    @DeleteMapping("/{id}")
		public void deleteById(@PathVariable Long id) {
			
	   	teamService.deleteTeamById(id);	
		}
	    
		@PostMapping
		public Team addTeam(@RequestBody Team team) {

		return teamService.addTeam(team);
	}
		
		@PutMapping
		public Team editTeam(@RequestBody Team t) {
		
			return teamService.updateTeam(t);
		}
}
