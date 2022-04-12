package Logico;

import java.util.Date;

public class Consulta {
	private String codigo;
	private Paciente paciente;
	private Doctor doctor;
	private Date fecha;
	private String diagnostico;
	
	
	public Consulta(String codigo, Paciente paciente, Doctor doctor, Date fecha, String diagnostico) {
		super();
		this.codigo = codigo;
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
		this.diagnostico = diagnostico;
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
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	
}
