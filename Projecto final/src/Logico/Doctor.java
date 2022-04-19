package Logico;

import java.util.ArrayList;

public class Doctor {
	

	private Persona[] doctor;
	private String especialidad;
	private ArrayList<Historial> miHistorial;
	
	public Doctor(ArrayList<Historial>miHistorial, Persona doctor, String especialidad) {
		super();
		this.doctor = new Persona[2];
		this.especialidad = especialidad;
		this.miHistorial = miHistorial;
		
	}
		public Persona[] getDoctor() {
			return doctor;
		}
		public void setDoctor(Persona[] doctor) {
			this.doctor = doctor;
		}
		
		public  ArrayList<Historial>getMiHistorial() {
			return miHistorial;
		}
		public void setMiHistorial(ArrayList<Historial>miHistorial) {
			this.miHistorial = miHistorial;
		}
        public String getEspecialidad() {
        	return especialidad;
        }
        public void  setEspecialidad(String especialidad) {
        	this.especialidad = especialidad;
        }

}
