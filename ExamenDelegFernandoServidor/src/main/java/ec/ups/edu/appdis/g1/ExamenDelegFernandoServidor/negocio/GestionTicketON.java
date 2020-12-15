package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.dao.TicketDAO;
import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.dao.VehiculoDAO;
import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Ticket;
import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Vehiculo;

@Stateless
public class GestionTicketON implements GestionTicketONRemoto{
	
	@Inject
	private TicketDAO daoTicket;
	@Inject
	private VehiculoDAO daoVehiculo;
	
	public boolean crearTicket(Ticket ticket) {
		try {
			daoTicket.insert(ticket);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean crearVehiculo(Vehiculo vehiculo) {
		try {
			daoVehiculo.insert(vehiculo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
		
		return true;
	}
	
}
