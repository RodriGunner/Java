package Ejemplo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton BOTON; 
	private JTextField txNombre;
	
	public Ventana() {
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(350,350);
		setTitle("NUEVO");
		getContentPane().setLayout(null);
		
		//BOTON
		BOTON = new JButton();
		BOTON.setText("Aceptar");
		BOTON.setBounds(63,199,140,30);
		
		//TEXTBOX
		txNombre = new JTextField();
		txNombre.setColumns(10);
		txNombre.setBounds(31,27,200,36);
		
		
		BOTON.addActionListener(new eventoBoton(txNombre));
		
	
		getContentPane().add(BOTON);
		getContentPane().add(txNombre);
						
		
	}
	
	
	

	
	public void CambiarVisibilidad(boolean estado) {
		
		setVisible(true);
	}
}

class eventoBoton implements ActionListener {

	private JTextField txtNombre;
	
	public eventoBoton(JTextField txt) {
		
		
		txtNombre= txt;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Hola "+ txtNombre.getText());
		
	}
	
	
}