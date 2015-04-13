package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class EditorFicheros {

	private JFrame frame;
	private JFileChooser fileChooser;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorFicheros window = new EditorFicheros();
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
	public EditorFicheros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Lector Fichero");
		
		//Instanciamos el objeto JFileChooser inicialmente no es visible
		fileChooser = new JFileChooser();
		
		//Creamos la interfaz
		
		JPanel botonera = new JPanel();
		//Instanciamos el layout
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER,10,10);
		botonera.setLayout(flowLayout);
		
		JButton botonAbrir = new JButton("abrir");
		botonAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostramos al usuario el filechooser. Pasamos frame ya que es un dialogo modal y bloquea el uso del frame
				int returnValor = fileChooser.showOpenDialog(frame);
				System.out.println(returnValor);
				if (returnValor== JFileChooser.APPROVE_OPTION) {
					File fileSelected = fileChooser.getSelectedFile();
					LeeFichero ficheroLeido = new LeeFichero(fileSelected);
					textArea.setText(ficheroLeido.getArchivo());
				}
			}
		});
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int returnValor = fileChooser.showSaveDialog(frame);
				//System.out.println(returnValor);
				/*if (returnValor== JFileChooser.APPROVE_OPTION) {
					File fileSelected = fileChooser.getSelectedFile();
					LeeFichero ficheroLeido = new LeeFichero(fileSelected);
					textArea.setText(ficheroLeido.getArchivo());
				}*/
			}
		});
		JButton botonSalir = new JButton("Salir");
		
		botonera.add(botonAbrir);
		botonera.add(botonGuardar);
		botonera.add(botonSalir);
		//Insertamos la botonera en el norte del borderLayout
		frame.getContentPane().add(botonera, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		
		
	}

}
