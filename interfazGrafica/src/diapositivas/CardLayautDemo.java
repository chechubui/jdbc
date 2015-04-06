package diapositivas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CardLayautDemo {
	public CardLayout cardLayout;
	public JPanel cards;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayautDemo window = new CardLayautDemo();
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
	public CardLayautDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		BorderLayout miLayout = new BorderLayout();
		frame.getContentPane().setLayout(miLayout);
	
		//creamos botonera
		JButton boton1= new JButton("Anterior");
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.previous(cards);
			}
		});
		JButton boton2= new JButton("Siguiente");
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.next(cards);
			}
		});
		
		
		JPanel panelNorte = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panelNorte, BoxLayout.X_AXIS);
		panelNorte.setLayout(boxLayout);
		
		//insertamos botones al panel
		panelNorte.add(boton1);
		panelNorte.add(boton2);
		
		//insertamos panel en zona norte del jframe
		frame.getContentPane().add(panelNorte,BorderLayout.NORTH);
		
		/*
		 * Si añadimos los dos componenetes a la misma zona solo vere el segundo
		frame.add(boton1,BorderLayout.NORTH);
		frame.add(boton1,BorderLayout.NORTH);*/
	
		//creamos el panel que va a contener el panel1 y 2
		// Al tener CardLayout
		cards = new JPanel();
		cardLayout = new CardLayout();
		cards.setLayout(cardLayout);
		
		JPanel panel1 = new JPanel();
		JLabel etiqueta1 = new JLabel("Este es el panel numero 1");
		panel1.add(etiqueta1);
		
		JPanel panel2 = new JPanel();
		JLabel etiqueta2 = new JLabel("Este es el panel numero 2");
		panel2.add(etiqueta2);
		
		JPanel panel3 = new JPanel();
		JLabel etiqueta3 = new JLabel("Este es el panel numero 3");
		JButton botonPanel3 = new JButton("Boton");
		JButton botonPanel33 = new JButton("Boton2");
		botonPanel33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cierra la ventana
				frame.dispose();
			}
		});
		panel3.add(etiqueta3);
		panel3.add(botonPanel3);
		panel3.add(botonPanel33);
		
		cards.add(panel1);
		cards.add(panel2);
		cards.add(panel3);
		
		frame.getContentPane().add(cards, BorderLayout.CENTER);
		
		
		
	
	}

}
