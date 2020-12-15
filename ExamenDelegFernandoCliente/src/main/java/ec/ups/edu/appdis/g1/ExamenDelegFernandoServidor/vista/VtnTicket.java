package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Ticket;
import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.modelo.Vehiculo;
import ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.negocio.GestionTicketONRemoto;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.JDBCType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.awt.event.ActionEvent;

public class VtnTicket extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtFecha;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private GestionTicketONRemoto on;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnTicket frame = new VtnTicket();
					frame.setVisible(true);
					frame.referenciarONTicket();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VtnTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PARQUEO");
		lblNewLabel.setBounds(177, 42, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Numero:");
		lblNewLabel_2.setBounds(24, 105, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Ingreso:");
		lblNewLabel_3.setBounds(23, 147, 100, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNumero = new JTextField();
		txtNumero.setText("");
		txtNumero.setBounds(136, 102, 86, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(136, 144, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar Ticket");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearTicket();
				
			}
		});
		btnGuardar.setBounds(120, 194, 143, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_5 = new JLabel("Placa:");
		lblNewLabel_5.setBounds(282, 69, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Marca:");
		lblNewLabel_6.setBounds(282, 105, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Modelo:");
		lblNewLabel_7.setBounds(282, 147, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(338, 66, 86, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(338, 102, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(338, 144, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
	}
	
	protected void crearTicket() {
		
		Ticket t = new Ticket();
		Vehiculo v = new Vehiculo();
		t.setNumero(Integer.parseInt(txtNumero.getText()));
		t.setFecha_ingreso(txtFecha.getText());
		t.setVehiculo(v);
	
		
		v.setMarca(txtMarca.getText());
		v.setModelo(txtModelo.getText());
		v.setPlaca(txtPlaca.getText());
		
		try {
			on.crearTicket(t);
			on.crearVehiculo(v);
			System.out.println("Guardado OK");
		} catch (Exception e) {
			System.out.println("Error al guardar"+ e.getMessage());
			e.printStackTrace();
		}
	}
	public void referenciarONTicket() throws Exception {
		try {  
	        final Hashtable<String, Comparable> jndiProperties =  
	                new Hashtable<String, Comparable>();  
	        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
	                "org.wildfly.naming.client.WildFlyInitialContextFactory");  
	        jndiProperties.put("jboss.naming.client.ejb.context", true);  
	          
	        jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
	        jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejbremoto");  
	        jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb01");  
	          
	        final Context context = new InitialContext(jndiProperties);  
	          
	        final String lookupName = "ejb:/ExamenDelegFernandoServidor/GestionTicketON!ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.negocio.GestionTicketONRemoto";  
	          
	        this.on = (GestionTicketONRemoto) context.lookup(lookupName);  
	          
	    } catch (Exception ex) {  
	        ex.printStackTrace();  
	        throw ex;  
	    }  
	}
}
