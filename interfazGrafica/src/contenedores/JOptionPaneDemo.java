package contenedores;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOptionPaneDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneDemo window = new JOptionPaneDemo();
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
	public JOptionPaneDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel miPanel = new JPanel();
		
		frame.getContentPane().add(miPanel, BorderLayout.CENTER);
		
		JButton Boton = new JButton("Dialogo de mensaje");
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "ha ocurrido un error grabe", "Error" , JOptionPane.ERROR_MESSAGE );
			}
		});
		miPanel.add(Boton);
		
		
		/*JButton Boton2 = new JButton("Dialogo con opciones");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] options= {"Opcion 1","Opcion 2","Opcion 3"};
				JOptionPane.showOptionDialog(frame, "Selecciona una opcion",  "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null,null);
			}
		});*/
		
		JButton Boton2 = new JButton("Dialogo con opciones");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options= {"Opcion 1","Opcion 2","Opcion 3"};
				int respuesta = JOptionPane.showOptionDialog(frame, "Selecciona una opcion",  "Selecciona una opcion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null,null);
				if(respuesta == JOptionPane.OK_OPTION){
					//codigo que se ejecuta
					
				}
				
					
			}
		});
		
		miPanel.add(Boton2);
		
		JButton Boton3 = new JButton("Dialogo con mas opciones");
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options= {"jaen","marca","gol"};
				String ciudad = (String)JOptionPane.showInputDialog(frame,"Hola amigo","escoge",JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
			
				if(ciudad !=null){
					JOptionPane.showMessageDialog(frame,ciudad);
				}
					
			}
		});
		
		miPanel.add(Boton3);
		
		//no esta terminado , debe de meter un texto
		JButton Boton4 = new JButton("Dialogo entrada de datos");
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options= {"jaen","marca","gol"};
				String ciudad = (String)JOptionPane.showInputDialog(frame,"Hola amigo","escoge",JOptionPane.PLAIN_MESSAGE);
			
				if(ciudad !=null){
					JOptionPane.showMessageDialog(frame,ciudad);
				}
					
			}
		});
		miPanel.add(Boton4);
		
		JButton Boton5 = new JButton("Dialogo personalizado");
		Boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialogDemo miDialogo = new JDialogDemo(frame);
			}
		
		});
		miPanel.add(Boton5);
		
		
	}

}
