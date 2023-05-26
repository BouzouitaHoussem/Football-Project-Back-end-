package com.example.formationmai.soccerMai.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MATCHES")
public class Matche {
	
	@Id
	@Column(name="MATCH_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int scoreOne;
	private int scoreTwo;
	private String teamOne;
	private String teamTwo;
	
	private Matche() {
		super();
		
	}

	public Matche(int scoreOne, int scoreTwo, String teamOne, String teamTwo) {
		super();
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getScoreOne() {
		return scoreOne;
	}

	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}

	public int getScoreTwo() {
		return scoreTwo;
	}

	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	@Override
	public String toString() {
		return "Matche [id=" + id + ", scoreOne=" + scoreOne + ", scoreTwo=" + scoreTwo + ", teamOne=" + teamOne
				+ ", teamTwo=" + teamTwo + "]";
	}
	
	

	
}
