package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo;

import java.io.Serializable;


public class Vehiculo implements Serializable{
	
	
	private String placa;
	private String marca;
	private String modelo;
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
