package componenetes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreeDemo window = new JTreeDemo();
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
	public JTreeDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode datosJugadores = creaArbol();
		JTree arboljugadores = new JTree(datosJugadores);
		
		JScrollPane scroll = new JScrollPane(arboljugadores);
		
		frame.add(scroll, BorderLayout.CENTER);
	}

	private DefaultMutableTreeNode creaArbol(){
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Equipos");
		
		DefaultMutableTreeNode juve = new DefaultMutableTreeNode("Juve");
		DefaultMutableTreeNode barca = new DefaultMutableTreeNode("Barca");
		DefaultMutableTreeNode jaen = new DefaultMutableTreeNode("Jaen");
		raiz.add(juve);
		raiz.add(barca);
		raiz.add(jaen);
		
		
		DefaultMutableTreeNode nando = new DefaultMutableTreeNode("Nando");
		DefaultMutableTreeNode montero = new DefaultMutableTreeNode("Montero");
		jaen.add(nando);
		jaen.add(montero);
		
		DefaultMutableTreeNode morata = new DefaultMutableTreeNode("Morata");
		DefaultMutableTreeNode pogba = new DefaultMutableTreeNode("Pogba");
		juve.add(morata);
		juve.add(pogba);
		
		DefaultMutableTreeNode messi = new DefaultMutableTreeNode("messi");
		DefaultMutableTreeNode luis = new DefaultMutableTreeNode("Suarez");
		barca.add(messi);
		barca.add(luis);
		
		DefaultMutableTreeNode min = new DefaultMutableTreeNode("2000 min");
		DefaultMutableTreeNode goles = new DefaultMutableTreeNode("40 goles");
		messi.add(min);
		messi.add(goles);
		
		return raiz;
	
	}
	
}
