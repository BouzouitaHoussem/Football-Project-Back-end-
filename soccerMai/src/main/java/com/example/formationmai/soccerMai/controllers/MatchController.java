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

import com.example.formationmai.soccerMai.models.Matche;
import com.example.formationmai.soccerMai.services.MatchService;

@RequestMapping("matches")
@CrossOrigin("*")
@RestController
public class MatchController {
	
	@Autowired
	public MatchService matchService;
	
	@GetMapping
	public List<Matche> getAll(){
    return matchService.getAllMatches();
    
    }
	
	@GetMapping("/{id}")
	public Matche getById(@PathVariable Long id) {
		
	return matchService.getMatchById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		
   	matchService.deleteMatchById(id);	
	}
	
	@PostMapping
	public Matche addMatch(@RequestBody Matche match) {

	return matchService.addMatch(match);
}
	@PutMapping
	public Matche editMatch(@RequestBody Matche m) {
	
		return matchService.updateMatch(m);
	}
}