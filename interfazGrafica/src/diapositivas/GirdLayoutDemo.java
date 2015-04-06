package diapositivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GirdLayoutDemo {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirdLayoutDemo window = new GirdLayoutDemo();
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
	public GirdLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 20, 15));
		
		//Persona p1= new Persona("Jesus", "Buitrago", "avenida de barcelona", Localidad.GRANADA);
		
		JLabel lblNombre = new JLabel("Nombre");
		frame.getContentPane().add(lblNombre);
		
		textFieldNombre = new JTextField();
		//textFieldNombre.setText(p1.getNombre());
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		frame.getContentPane().add(lblApellidos);
		
		textFieldApellidos = new JTextField();
		//textFieldApellidos.setText(p1.getApellido());
		frame.getContentPane().add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		frame.getContentPane().add(lblDireccion);
		
		textFieldDireccion = new JTextField();
		//textFieldDireccion.setText(p1.getDireccion());
		frame.getContentPane().add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		frame.getContentPane().add(lblLocalidad);
		
		JComboBox<Localidad> comboBox = new JComboBox<Localidad>();
		comboBox.setModel(new DefaultComboBoxModel<Localidad>(Localidad.values()));
		frame.getContentPane().add(comboBox);
		
		//Persona p2 = new Persona(textFieldNombre.getText(), textFieldApellidos.getText(), direccion, localidad)
		
		JButton btnAceptar = new JButton("Aceptar");
		frame.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		frame.getContentPane().add(btnCancelar);
	}

}
