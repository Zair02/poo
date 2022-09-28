package vista;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista {
	
	private JFrame frame = new JFrame("Empresas");
	private JPanel panel;
	
	private JTable tabla;
	private JButton btnGenerar;
	private JButton btnBorrar;

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
		
		btnBorrar = new JButton("Borrar Fila");
		btnBorrar.setBounds(170, 10, 150, 30);
		btnBorrar.setEnabled(false);
		panel.add(btnBorrar);
	}


	public void mostrar() {
		this.frame.setVisible(true);
	}

	public void generarTabla(String[][] informacion) {
		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
				informacion,
				new String[] {"Empresa", "Empleado", "Puesto"}
				));
		frame.add(tabla, BorderLayout.CENTER);
		
		JScrollPane sp = new JScrollPane(tabla);
		frame.add(sp, BorderLayout.CENTER);
		frame.validate();
		
		btnGenerar.setEnabled(false);
	}
	
	public void habilitarBtnBorrar() {
		btnBorrar.setEnabled(true);
	}

	public void borrarFila() {
		((DefaultTableModel) tabla.getModel()).removeRow(tabla.getSelectedRow());
		btnBorrar.setEnabled(false);
	}

	public JButton getBtnGenerar() {
		return btnGenerar;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}
	
	public Integer getFila() {
		return tabla.getSelectedRow();
	}
	
	public JTable getTabla() {
		return tabla;
	}

}
