package diapositivas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutDemo {
	private JFrame ventana;
	
	FlowLayoutDemo(String titulo) {
	ventana = new JFrame("Prueba de lo que quieras");
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventana.setSize(300,100);
	ventana.setVisible(true);
	
	JPanel panelCentral = new JPanel();
	/*FlowLayout miFlowLayout = new FlowLayout();
	ventana.setLayout(miFlowLayout);*/
	
	JButton boton1= new JButton("boton 1");
	JButton boton2= new JButton("boton 2");
	JButton boton3= new JButton("boton 3");
	JTextField textField = new JTextField(10);
	JLabel etiqueta = new JLabel("Etiqueta");
	
	panelCentral.add(boton1);
	panelCentral.add(boton2);
	panelCentral.add(boton3);
	panelCentral.add(textField);
	panelCentral.add(etiqueta);
	
	
	
	
	
	
	
	
	ventana.add(panelCentral,BorderLayout.CENTER);
	
	}
	public static void main(String[] args) {
		new FlowLayoutDemo("Prueba FlowLayout");
	}
}
