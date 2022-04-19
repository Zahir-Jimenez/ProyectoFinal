package Logico;

import java.util.Date;

public class Historial {
	protected String codigo;
	protected Paciente paciente;
	protected Date fecha;
	protected Doctor doctor; 
	protected float precio;
	protected String hecho;
	public Historial(String codigo, Paciente paciente, Doctor doctor, Date fecha, float precio, String hecho) {
		super();
		this.codigo = codigo;
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
		this.precio = precio;
		this.hecho = hecho;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getHecho() {
		return hecho;
	}
	public void setHecho(String hecho) {
		this.hecho = hecho;
	}

	
}



