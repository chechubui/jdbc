package diapositivas;


import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class MiVentanaBorderLayout {
	
	private JFrame ventana;


	public MiVentanaBorderLayout(){
		ventana = new JFrame();
		ventana.setTitle("Titulo de ventana");
		//ventana.setSize(300, 200);
		ventana.setSize(new Dimension(300,200));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	BorderLayout miLayout = new BorderLayout(30,30);//(30,30) separarcion entre los layout
	ventana.getContentPane().setLayout(miLayout);
	JLabel etiqueta = new JLabel("Mi etiqueta");
	ventana.getContentPane().add(etiqueta, BorderLayout.NORTH);
	
	JButton boton = new JButton ("pulsa aqui");
	boton.setPreferredSize(new Dimension(200, 50));
	ventana.getContentPane().add(boton,BorderLayout.WEST);
		
	JLabel etiqueta2 = new JLabel("tu etiqueta");
	ventana.getContentPane().add(etiqueta2, BorderLayout.SOUTH);
	
	JTextPane etiquetaEste = new JTextPane();
	etiquetaEste.setText("Hola Amigo que tal estas");
	ventana.getContentPane().add(etiquetaEste, BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) {
		MiVentanaBorderLayout app=new MiVentanaBorderLayout();
		
	}
}
