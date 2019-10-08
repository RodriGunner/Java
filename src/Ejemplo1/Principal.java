package Ejemplo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		JFrame  frame  = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(350,350);
		frame.setTitle("TITULO");
		JButton BOTON = new JButton();
		BOTON.setText("Aceptar");
		BOTON.setBounds(10,15,140,130);
		frame.setLayout(null);
		frame.getContentPane().add(BOTON);
		frame.setVisible(true);
	}

}
