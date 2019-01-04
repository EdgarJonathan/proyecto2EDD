package com.edd.objetos;

public class Usuario {
	
	
	private String id;
	private String nombre;
	private String contra;
	
	
	
	Usuario()
	{
		
	}
	
	
	Usuario(String id, String nombre, String contra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contra = contra;
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	

		
}
