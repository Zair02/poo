package vista;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista {
	
	private JFrame frame = new JFrame("Empresas");
	private JPanel panel;
	
	private JTable tabla;
	private JButton btnGenerar;

	public Vista() {
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		generarPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
	}
	
	
	private void generarPanel() {
		btnGenerar = new JButton("Generar Tabla");
		btnGenerar.setBounds(10, 10, 150, 30);
		panel.add(btnGenerar);
	}


	public void mostrar() {
		this.frame.setVisible(true);
	}


	public void generarTabla(String[][] informacion) {
		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
				informacion,
				new String[] {"Empleado", "Fecha de Nacimiento", "Puesto"}
				));
		frame.add(tabla, BorderLayout.CENTER);
		
		JScrollPane sp = new JScrollPane(tabla);
		frame.add(sp, BorderLayout.CENTER);
		frame.validate();
	}

	public JButton getBtnGenerar() {
		return btnGenerar;
	}

}
