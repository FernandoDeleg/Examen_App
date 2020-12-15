package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.negocio;



import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Ticket;
import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Vehiculo;


public interface GestionTicketONRemoto {

	public boolean crearTicket(Ticket ticket)throws Exception;
	public boolean crearVehiculo(Vehiculo vehiculo) throws Exception;
}
