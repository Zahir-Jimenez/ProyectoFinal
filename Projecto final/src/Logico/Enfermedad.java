package Logico;

import java.util.ArrayList;

public class Enfermedad {
	
	private String codigo;
	private String titulo;
	private ArrayList<String> sintomas;
	
	public Enfermedad(String codigo, String titulo, ArrayList<String> sintomas) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.sintomas = sintomas;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<String> getSintomas() {
		return sintomas;
	}
	public void setSintomas(ArrayList<String> sintomas) {
		this.sintomas = sintomas;
	}
}
