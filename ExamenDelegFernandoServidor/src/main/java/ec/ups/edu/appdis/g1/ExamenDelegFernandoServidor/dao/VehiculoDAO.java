package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Vehiculo;

@Stateless
public class VehiculoDAO {

	@PersistenceContext
	EntityManager em;
	
	public VehiculoDAO() {
		
	}
	
	public boolean insert(Vehiculo vehiculo) throws SQLException{
		em.persist(vehiculo);
		return true;
	}
}
