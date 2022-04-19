package Logico;

import java.util.ArrayList;


public class Persona {
	
	private String cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Persona> miHistorial;

	
	public Persona (String cedula, String nombre, String direccion, String telefono,ArrayList<Persona> miHistorial) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Persona> getMiHistorial() {
		return miHistorial;
	}
	public void setMiHistorial(ArrayList<Persona> miHistorial) {
		this.miHistorial = miHistorial;
	}



}
