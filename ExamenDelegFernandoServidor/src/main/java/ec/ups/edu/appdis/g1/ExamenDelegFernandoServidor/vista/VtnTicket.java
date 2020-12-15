package ec.ups.edu.appdis.g1.ExamenDelegFernandoServidor.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VtnTicket extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtFecha;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnTicket frame = new VtnTicket();
					frame.setVisible(true);
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
		lblNewLabel.setBounds(188, 44, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Numero:");
		lblNewLabel_2.setBounds(21, 105, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Ingreso:");
		lblNewLabel_3.setBounds(43, 147, 80, 14);
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
		btnGuardar.setBounds(188, 192, 127, 23);
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
}
