package componenetes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTree;

public class JTreePersonaHijos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreePersonaHijos window = new JTreePersonaHijos();
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
	public JTreePersonaHijos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		PersonaHijos arbol = creaArbol();
		arbol.pintaArbol();
			
	}
	
	private PersonaHijos creaArbol(){
		PersonaHijos raiz = new PersonaHijos("Antonio", "Lol", "sanceh");
		
		
		PersonaHijos hijo1 = new PersonaHijos("Jes", "Lu", "Me");
		PersonaHijos hijo2 = new PersonaHijos("chema", "Llu", "todo");
		
		raiz.addHijo(hijo1);
		raiz.addHijo(hijo2);
		
		PersonaHijos nieto1 = new PersonaHijos("pilar", "molina", "lopez");
		hijo2.addHijo(nieto1);
		
		return raiz;
		
	}

}
