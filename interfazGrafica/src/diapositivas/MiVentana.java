package diapositivas;
 
import java.awt.Dimension;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;

public class MiVentana {
	public void creaGUI(){
		JFrame ventana = new JFrame();
		ventana.setTitle("Mi primera ventana en SWING");
		ventana.setSize(500, 300);
		//ventana.setSize(new Dimension(300,200)); otra forma de hacerlo , pero debemos  de importar java.awt....
		//ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//hacemos que cuando pulsemo X se cierre la vetana
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(100,100));//decimos la dimension mininma de la ventana
		ventana.setVisible(true);
		ventana.setResizable(false);
		
		//creamos el boton
		JButton miBoton = new JButton();
		miBoton.setForeground(new Color(0, 0, 255));
		miBoton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		miBoton.setText("Pulsa Aqui");
	
		//añadimos el boton en la ventana
		ventana.getContentPane().add(miBoton);
		
		JButton BotonIzquierdo = new JButton("Boton Izquierdo");
		ventana.getContentPane().add(BotonIzquierdo, BorderLayout.WEST);
		
		JButton BotonAbajo = new JButton("Boton Abajo");
		ventana.getContentPane().add(BotonAbajo, BorderLayout.SOUTH);
		
		JButton BotonDerecho = new JButton("Boton Derecho");
		ventana.getContentPane().add(BotonDerecho, BorderLayout.EAST);
		
		JButton BotonArriba = new JButton("Boton Arriba");
		ventana.getContentPane().add(BotonArriba, BorderLayout.NORTH);
		
		
	}
	
	
	public static void main(String[] args) {
		MiVentana app = new MiVentana();
		app.creaGUI();
	}
}
