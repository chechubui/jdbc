package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio2 {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEmail;
	private JTextField textLogin;
	private JTextField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
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
	public Ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		JLabel lblApellidos = new JLabel("Apellidos");
		
		JLabel lblEmail = new JLabel("Email");
		
		JLabel lblLogin = new JLabel("Login");
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				String nombre = textNombre.getText();
				String apellido = textApellido.getText();
				textLogin.setText(nombre.toLowerCase().substring(0, 1)+""+apellido.toLowerCase().replace(" ", ""));
			}
		});
		textApellido.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		textLogin = new JTextField();
		textLogin.setColumns(10);
		
		textContraseña = new JTextField();
		textContraseña.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String todo = textNombre.getText()+";"+textApellido.getText()+";"+textEmail.getText()+";"+
						textLogin.getText()+";"+textContraseña.getText();
				/*String nombre=textNombre.getText()+";";
				String apellido =textApellido.getText()+";";
				String email= textEmail.getText()+";";
				String login=textLogin.getText()+";";
				String contraseña=textContraseña.getText();*/
				
				File outFile = new File("C:/Users/mañana/Desktop/Interfaz/usuario.csv");
				try (PrintWriter out= new PrintWriter(new FileOutputStream(outFile));) {
					//texto que contraseña tiene más de 6 caracteres y que el email es válido
					
					if( textContraseña.getText().length()< 6){
						System.out.println("La constraseña es mal construida");
						JOptionPane.showMessageDialog(null,
								"La constraseña es mal construida",
								"Error", JOptionPane.WARNING_MESSAGE);
					}
					
					if(!textEmail.getText().matches(".*@.*")){
						System.out.println("Email mal construido");
						JOptionPane.showMessageDialog(null,
								"Email mal construido",
								"Error", JOptionPane.WARNING_MESSAGE);
					}
					
					else{
					
					/*out.write(nombre);
					out.write(apellido);
					out.write(email);
					out.write(login);
					out.write(contraseña);*/
					out.write(todo);
					
					JOptionPane.showMessageDialog(null,
							"Usuario Guardado ",
							"Guardado", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
		
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblContrasea, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblApellidos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textLogin, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
						.addComponent(textEmail)
						.addComponent(textApellido)
						.addComponent(textNombre)
						.addComponent(textContraseña))
					.addContainerGap(229, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(211, Short.MAX_VALUE)
					.addComponent(btnGuardar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalir)
					.addGap(39))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidos)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLogin)
						.addComponent(textLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea)
						.addComponent(textContraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar)
						.addComponent(btnSalir))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}
}
