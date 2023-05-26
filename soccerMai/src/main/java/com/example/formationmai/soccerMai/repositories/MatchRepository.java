package com.example.formationmai.soccerMai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.formationmai.soccerMai.models.Matche;

@Repository
public interface MatchRepository extends JpaRepository<Matche, Long> {

}
