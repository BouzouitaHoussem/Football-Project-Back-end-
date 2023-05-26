package com.example.formationmai.soccerMai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.formationmai.soccerMai.models.Team;


@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
