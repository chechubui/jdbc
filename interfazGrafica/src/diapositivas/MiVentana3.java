package diapositivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MiVentana3 {

	private JFrame ventana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana3 window = new MiVentana3();
					window.ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiVentana3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventana = new JFrame();
		ventana.setFont(new Font("Cambria Math", Font.ITALIC, 15));
		ventana.setTitle("Mi ventana desde WindowBuilder");
		ventana.setBounds(100, 100, 450, 300);
		
		JButton btnBoton = new JButton("Boton");
		ventana.getContentPane().add(btnBoton, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		ventana.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		ventana.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("New button3");
		ventana.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("New button4");
		ventana.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
	}

}
