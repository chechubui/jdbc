package contenedores;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JFramePruebas {
	private JFrame ventana;
	
	public JFramePruebas(){
		ventana = new JFrame("Pruebas de ventana");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setIconImage(Toolkit.getDefaultToolkit().getImage(JFramePruebas.class.getResource("/imagenes/jaen.jpeg")));
		JButton boton = new JButton("Boton de prueba");
		JButton boton2 = new JButton("Boton ");
		FlowLayout miFlowLayout = new FlowLayout(FlowLayout.LEFT, 10 ,10);
		ventana.getContentPane().setLayout(miFlowLayout);
		//ventana.add(boton, BorderLayout.CENTER);
		//ventana.setBounds(0, 0, 300, 200);
		ventana.getContentPane().add(boton);
		ventana.getContentPane().add(boton2);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	
		ventana.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				int returnVal = JOptionPane.showConfirmDialog(ventana,
						"¿Realmente desea cerrar la ventana?");
				if (returnVal == JOptionPane.OK_OPTION){
					ventana.setVisible(false);
					ventana.dispose();
					
					}
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		

	}
	public static void main(String[] args) {
		new JFramePruebas();
		
	}
}
