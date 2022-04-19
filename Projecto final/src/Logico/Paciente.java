package Logico;

import java.util.ArrayList;

public class Paciente {
	
	
	
	private ArrayList<Historial>miHistorial;
	private Persona[]paciente;
	

	public Paciente(ArrayList<Historial>miHistorial, Persona paciente) {
		super();
		this.paciente = new Persona[5];
		this.miHistorial = miHistorial;
		
	}
		public Persona[] getPaciente() {
			return paciente;
		}
		public void setPaciente(Persona[] paciente) {
			this.paciente = paciente;
		}
		
		public  ArrayList<Historial>getMiHistorial() {
			return miHistorial;
		}
		public void setMiHistorial(ArrayList<Historial>miHistorial) {
			this.miHistorial = miHistorial;
		}

}
