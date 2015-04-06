package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;

public class GirdBagLayaouDemo {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JLabel lblApellidos;
	private JTextField textFieldApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirdBagLayaouDemo window = new GirdBagLayaouDemo();
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
	public GirdBagLayaouDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setForeground(new Color(50, 205, 50));
		panelCentral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "programa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		frame.getContentPane().add(panelCentral,BorderLayout.CENTER);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0,0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0,0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		//frame.getContentPane().setLayout(gridBagLayout);
		panelCentral.setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panelCentral.add(lblNombre, gbc_lblNombre);
		
		textFieldNombre = new JTextField();
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombre.anchor = GridBagConstraints.NORTH;
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNombre.gridx = 1;
		gbc_textFieldNombre.gridy = 0;
		panelCentral.add(textFieldNombre, gbc_textFieldNombre);
		
		textFieldNombre.setColumns(5);
		
		lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 0, 5);
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 0;
		//frame.getContentPane().add(lblApellidos, gbc_lblApellidos);
		panelCentral.add(lblApellidos, gbc_lblApellidos);
		
		textFieldApellidos = new JTextField();
		GridBagConstraints gbc_textFieldApellidos = new GridBagConstraints();
		gbc_textFieldApellidos.fill = GridBagConstraints.VERTICAL;
		gbc_textFieldApellidos.gridx = 3;
		gbc_textFieldApellidos.gridy = 0;
		panelCentral.add(textFieldApellidos, gbc_textFieldApellidos);
		textFieldApellidos.setColumns(15);
	}

}
