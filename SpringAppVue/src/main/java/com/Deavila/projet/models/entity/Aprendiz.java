package com.Deavila.projet.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="aprendiz")

public class Aprendiz {
	@Id
	@Column(name="cod-apre")
	private int codigo;
	@Column(name="nomb-apre")
	private String nombre;
	@Column(name="ape-apre")
	private String apellido;
	@Column(name="edad-apre")
	private int edad;
	@Column(name="fechaNac-apre")
	private String fechaNac;
	@Column(name="dir-apre")
	private String direccion;
	@Column(name="tel-apre")
	private String tel;
	public Aprendiz() {
		super();
	}
	public Aprendiz(int codigo, String nombre, String apellido, int edad, String fechaNac, String direccion,
			String tel) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.tel = tel;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
