package com.Deavila.projet.models.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Deavila.projet.models.entity.Aprendiz;
import com.Deavila.projet.repository.AprendizRepository;

@Service

public class AprendizServiceImpl  implements AprendizService{
	

	@Autowired AprendizRepository aprendizRepository;
	@Override
	public Optional<Aprendiz> findById(Integer Id) {
		// TODO Auto-generated method stub
		return aprendizRepository.findById(Id);
	}

	@Override
	public List<Aprendiz> findAll() {
		// TODO Auto-generated method stub
		return aprendizRepository.findAll();
	}

	@Override
	public Aprendiz save(Aprendiz a) {
		// TODO Auto-generated method stub
		return aprendizRepository.save(a);
	}

	@Override
	public void deleteById(Integer Id) {
		// TODO Auto-generated method stub
		aprendizRepository.deleteById(Id);
		
	}
	
	

}
