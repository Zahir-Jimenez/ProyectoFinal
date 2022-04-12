package Logico;

import java.util.Date;

public class Cita {
	private String codigo;
	private String citante;
	private Doctor doctor;
	private Date fecha;
	
	public Cita(String codigo, String citante, Doctor doctor, Date fecha) {
		super();
		this.codigo = codigo;
		this.citante = citante;
		this.doctor = doctor;
		this.fecha = fecha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCitante() {
		return citante;
	}
	public void setCitante(String citante) {
		this.citante = citante;
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
	
	
}
