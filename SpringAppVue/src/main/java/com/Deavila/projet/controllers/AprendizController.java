package com.Deavila.projet.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Deavila.projet.models.entity.Aprendiz;
import com.Deavila.projet.models.service.AprendizService;

@RestController
@RequestMapping("api/aprendiz")
public class AprendizController {
	@Autowired
	AprendizService apeAprendizService;
	
	
	@GetMapping("/{Id}")
	public Optional<Aprendiz> buscarId(@PathVariable Integer Id){
		return apeAprendizService.findById(Id);
	}
	
	@GetMapping("/listar")
	public List<Aprendiz> listar(){
		
		return apeAprendizService.findAll();
	}
	@PostMapping
	public Aprendiz registrar(@RequestBody Aprendiz a) {
		return apeAprendizService.save(a);
		
		
	}
	@DeleteMapping("/{Id}")
	
	public void borrar(@PathVariable Integer Id) {
		apeAprendizService.deleteById(Id);
		
	}
	@PutMapping("/actualizar/{Id}")
	public Aprendiz actualizar(@RequestBody Aprendiz a, @PathVariable Integer Id) {
		
		Aprendiz aEnBds=apeAprendizService.findById(Id).get();
		aEnBds.setCodigo(a.getCodigo());
		aEnBds.setNombre(a.getNombre());
		aEnBds.setApellido(a.getApellido());
		aEnBds.setEdad(a.getEdad());
		aEnBds.setFechaNac(a.getFechaNac());
		aEnBds.setDireccion(a.getDireccion());
		aEnBds.setTel(a.getTel());
		apeAprendizService.save(aEnBds);
		return a;
		
		
	}
}
