package vista;

import javax.swing.*;

import idiomas.IdiomasPermitidos;

public class Vista {

	private JFrame frame = new JFrame("Idiomas"); 
	private JPanel panel = new JPanel();
	
	private JComboBox<IdiomasPermitidos> idiomas;
	private JComboBox<String> mensajes;
	private JButton btnTraducir;
	private JLabel lblTraduccion;
	
	public Vista() {
		frame.setSize(380, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		generarPanel();
		frame.getContentPane().add(panel);
	}
	
	private void generarPanel() {
		panel.setLayout(null);
		
		idiomas = new JComboBox<IdiomasPermitidos>(IdiomasPermitidos.values());
		idiomas.setBounds(50, 30, 100, 30);
		frame.add(idiomas);
	
		mensajes = new JComboBox<String>(new String[] {"Saludar", "Despedirse", "Perdon" , "Pedir café", "Cuánto cuesta", "Dónde queda"});
		mensajes.setBounds(200, 30, 100, 30);
		frame.add(mensajes);
		
		btnTraducir = new JButton("Traducir");
		btnTraducir.setBounds(50, 80, 100, 30);
		frame.add(btnTraducir);
		
		lblTraduccion = new JLabel("");
		lblTraduccion.setBounds(200, 80, 100, 30);
		lblTraduccion.setHorizontalAlignment(JLabel.CENTER);
		frame.add(lblTraduccion);
	}
	
	public void mostrar() {
		frame.setVisible(true);
	}

	public IdiomasPermitidos getInputIdioma() {
		return (IdiomasPermitidos) idiomas.getSelectedItem();
	}
	
	public Integer getInputMensaje() {
		return mensajes.getSelectedIndex();
	}
	
	public JButton getBtnTraducir() {
		return btnTraducir;
	}
	
	public void setTraduccion(String traduccion) {
		lblTraduccion.setText(traduccion);
	}
}
