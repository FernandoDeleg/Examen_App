package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Ticket;

@Stateless
public class TicketDAO {

	@PersistenceContext
	EntityManager em;
	
	public TicketDAO() {
		
	}
	
	public boolean insert(Ticket ticket) throws SQLException{
		em.persist(ticket);
		return true;
	}
}
