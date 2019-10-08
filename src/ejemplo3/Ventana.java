package ejemplo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtFNac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("CONTACTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(70, 229, 275, 23);
		contentPane.add(btnAceptar);
		
		
		
		txtApellido = new JTextField();
		txtApellido.setBounds(132, 87, 241, 23);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(132, 42, 241, 23);
		contentPane.add(txtNombre);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(132, 136, 241, 23);
		contentPane.add(txtTelefono);
		
		txtFNac = new JTextField();
		txtFNac.setColumns(10);
		txtFNac.setBounds(132, 175, 241, 23);
		contentPane.add(txtFNac);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(27, 51, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(27, 96, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(27, 145, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(27, 184, 105, 14);
		contentPane.add(lblFechaNacimiento);
		
		btnAceptar.addActionListener(new eventoBoton(txtNombre));
		
	}
	public void CambiarVisibilidad(boolean estado) {
		
		setVisible(true);
	}
}

class eventoBoton implements ActionListener{

	private JTextField Nombre;
	
	public eventoBoton(JTextField nombre) {
		Nombre=nombre; 
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (Nombre.getText().isEmpty())
		{
		     System.out.println("Vacio");
		}
		else
		{
			System.out.println("Lleno");
		}
		
	}
	
}
