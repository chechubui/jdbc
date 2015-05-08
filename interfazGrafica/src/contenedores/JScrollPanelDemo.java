package contenedores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JScrollPanelDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JScrollPanelDemo window = new JScrollPanelDemo();
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
	public JScrollPanelDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//scrollPane y texTAera para izquierda
		
		JScrollPane scrollPaneIzquierda = new JScrollPane();
		scrollPaneIzquierda.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneIzquierda.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
	
		JTextArea textAreaIzquierda= new JTextArea();
		scrollPaneIzquierda.setViewportView(textAreaIzquierda);
		
		
		/*JTextArea textArea = new JTextArea();
		JScrollPane scrollPaneIzquierda = new JScrollPane(textArea);
		scrollPaneIzquierda.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneIzquierda.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);*/
		
		//scrollPane y texTAera para derecha
		JScrollPane scrollPaneDerecha = new JScrollPane();
		scrollPaneDerecha.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneDerecha.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
	
		JTextArea textAreaDerecha = new JTextArea();
		scrollPaneDerecha.setViewportView(textAreaDerecha);
		
		//Creamos el JSplitPane que contendra a ScrollPaneIzqquierda y derecha
		JSplitPane splitPane =new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPaneIzquierda,scrollPaneDerecha);
		//divisor de la mitad 
		splitPane.setResizeWeight(0.5);
		splitPane.setDividerLocation(1.0);
		//tamaño del divisor
		splitPane.setDividerSize(10);
		//iconos de expandir
		splitPane.setOneTouchExpandable(true);
		
		
		JScrollPane scrollPaneAbajo = new JScrollPane();
		scrollPaneAbajo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneAbajo.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textAreaAbajo = new JTextArea();
		scrollPaneAbajo.setViewportView(textAreaAbajo);
		
		JSplitPane splitPaneAbajo =new JSplitPane(JSplitPane.VERTICAL_SPLIT,splitPane,scrollPaneAbajo);
		//divisor de la mitad 
		splitPaneAbajo.setResizeWeight(0.5);
		splitPaneAbajo.setDividerLocation(1.0);
		//tamaño del divisor
		splitPaneAbajo.setDividerSize(10);
		//iconos de expandir
		splitPaneAbajo.setOneTouchExpandable(true);
		
		frame.getContentPane().add(splitPaneAbajo, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmAbrirArchivoIzquierda = new JMenuItem("Abrir Archivo Izquierda");
		mnArchivo.add(mntmAbrirArchivoIzquierda);
	}

}
