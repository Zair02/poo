import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class Vista {
	private JFrame frame;
	private JLabel labelIngreseNombre;
	private JTextField inputNombre;
	
	private JPanel panelSuperior;
	private JPanel panelInferior;
	
	private JButton botonSaludar;
	
	public Vista() {
		this.frame = new JFrame("Boton Saludador");
		this.frame.setSize(600, 200);
		
		this.generadorPanelSuperior();
		this.frame.getContentPane().add(BorderLayout.CENTER, this.panelSuperior);
		
		this.generadorPanelInferior();
		this.frame.getContentPane().add(BorderLayout.SOUTH, this.panelInferior);
		
	}
	
	private void generadorPanelSuperior() {
		this.panelSuperior = new JPanel();
		this.labelIngreseNombre = new JLabel("Ingrese su nombre");
		this.panelSuperior.add(this.labelIngreseNombre);
		
		this.inputNombre = new JTextField(20);
		this.inputNombre.setPreferredSize(new Dimension(200, 30));
		this.panelSuperior.add(this.inputNombre);
	}
	
	private void generadorPanelInferior() {
		this.panelInferior = new JPanel();
		this.botonSaludar = new JButton("Saludar");
		this.panelInferior.add(this.botonSaludar);
	}
	
	public void generarSaludo() {
		JOptionPane.showMessageDialog(frame, "Hola, " + inputNombre.getText() + "!");
	}
	
	public void mostrar() {
		this.frame.setVisible(true);
	}
	
	public JTextField getInputNombre() {
		return inputNombre;
	}
	
	public JButton getBotonSaludar() {
		return botonSaludar;
	}
	
}
