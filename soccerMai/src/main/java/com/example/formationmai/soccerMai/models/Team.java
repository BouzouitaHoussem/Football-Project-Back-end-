package com.example.formationmai.soccerMai.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TEAMS")
public class Team {
	
	@Id
	@Column(name="TEAM_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String stadium;
	private String country;
	private String owner;
	public Team() {
		super();
		
	}
	public Team(String name, String stadium, String country, String owner) {
		super();
		this.name = name;
		this.stadium = stadium;
		this.country = country;
		this.owner = owner;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", stadium=" + stadium + ", country=" + country + ", owner="
				+ owner + "]";
	}
	
	

}
