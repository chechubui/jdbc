package componenetes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableJugadores {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableJugadores window = new JTableJugadores();
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
	public JTableJugadores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				ArrayList<Jugador> lista = new ArrayList<Jugador>();
				Jugador j1 = new Jugador("pepe", "Real Madrid");
				Jugador j2 = new Jugador("bale", "Real Madrid");
				Jugador j3 = new Jugador("suarez","Barsa");
				lista.add(j1);
				lista.add(j2);
				lista.add(j3);
				
				String[] nombreColumnas ={"jugador","equipo"};
				JTableModelJugadores tableModel =new JTableModelJugadores(lista);
				
				
				//creamos la tabla con los
				JTable tablaJugadores = new JTable(tableModel);

				//asi nos evitamos hacer un metodo 
				JScrollPane scroll = new JScrollPane(tablaJugadores);
				
				frame.add(scroll,BorderLayout.CENTER);
				
		
		
		
		
	}

}
