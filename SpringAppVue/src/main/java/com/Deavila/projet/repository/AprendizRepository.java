package com.Deavila.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Deavila.projet.models.entity.Aprendiz;

@Repository
public interface AprendizRepository extends JpaRepository<Aprendiz, Integer> {

	
}
