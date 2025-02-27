package com.Deavila.projet.models.service;

import java.util.List;
import java.util.Optional;

import com.Deavila.projet.models.entity.Aprendiz;

public interface AprendizService {
	
	public Optional<Aprendiz>findById(Integer Id);
	public List<Aprendiz>findAll();
	public Aprendiz save(Aprendiz a);
	public void deleteById(Integer Id);
}
