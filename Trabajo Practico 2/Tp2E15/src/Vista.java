import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class Vista {
	private JFrame frame;
	
	private JPanel panelSuperior;
	private JLabel labelContraseña;
	private JTextField inputContraseña;
	
	private JPanel panelInferior;
	private JButton botonGenerar;
	
	private JButton botonBorrar;
	
	public Vista() {
		this.frame = new JFrame("Generador de contraseña");
		this.frame.setSize(600, 200);
		
		this.generarPanelSuperior();
		this.frame.getContentPane().add(BorderLayout.CENTER, this.panelSuperior);
		
		this.generarPanelInferior();
		frame.getContentPane().add(BorderLayout.SOUTH, panelInferior);
	
	}
	
	private void generarPanelSuperior() {
		this.panelSuperior = new JPanel();
		this.labelContraseña = new JLabel("CONTRASEÑA");
		this.panelSuperior.add(this.labelContraseña);
		
		this.inputContraseña = new JTextField(25);
		this.inputContraseña.setPreferredSize(new Dimension(200, 30));
		this.panelSuperior.add(this.inputContraseña);
	}
	
	private void generarPanelInferior() {
		this.panelInferior = new JPanel();
		this.botonGenerar = new JButton("Generar");
		this.panelInferior.add(this.botonGenerar);
		
		this.botonBorrar = new JButton("Borrar");
		this.panelInferior.add(this.botonBorrar);
	}
	
	public void mostrar() {
		this.frame.setVisible(true);
	}
	
	public JTextField getInputContraseña() {
		return inputContraseña;
	}
	
	public void setInputContraseña(JTextField inputContraseña) {
		this.inputContraseña = inputContraseña;
	}
	
	public JButton getBotonGenerar() {
		return botonGenerar;
	}
	
	public JButton getBotonBorrar() {
		return botonBorrar;
	}
}
