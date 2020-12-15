package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo;

import java.io.Serializable;
import java.util.Date;



public class Ticket implements Serializable{
	
	
	private int numero;
	private String fecha_ingreso;
	
	private Vehiculo vehiculo;



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
