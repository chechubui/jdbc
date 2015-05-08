package componenetes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableDemo window = new JTableDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JTableDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//hacemos un array con el nombre de las columa 
		String[] nombreColumnas ={"Real Madrid","Farsa","Real Jaen"};
		//creamos un array con los nombres de los jugadores
		Object [][] datos = {{"Casillas","Enanito","Nando"},{"Ronaldo","Picao","Nino"}};

		//creamos la tabla con los
		JTable tabla = new JTable(datos,nombreColumnas);

		/*
		//aqui hacemos un metodo para poner la cabera 
		frame.add(tabla.getTableHeader(),BorderLayout.NORTH);
		//añadimos al frame la tabla con un borderlayout
		frame.add(tabla,BorderLayout.CENTER);*/
		
		//asi nos evitamos hacer un metodo 
		JScrollPane scrollPane = new JScrollPane(tabla);
		frame.add(scrollPane,BorderLayout.CENTER);
		
	}

}

