import java.awt.BorderLayout;

import javax.swing.*;

public class Vista {
	private JFrame frame;
	private JPanel panel;
	private JButton boton1, boton2, boton3;
	
	public Vista() {
		this.frame = new JFrame("Botones");
		this.frame.setSize(300, 100);
	
		this.generadorPanel();
		this.frame.getContentPane().add(BorderLayout.CENTER, this.panel);
	}
		
	private void generadorPanel() {
		this.panel = new JPanel();
		this.boton1 = new JButton("Boton 1");
		this.boton2 = new JButton("Boton 2");
		this.boton3 = new JButton("Boton 3");
		this.panel.add(boton1);
		this.panel.add(boton2).setEnabled(false);;
		this.panel.add(boton3).setEnabled(false);;
	}
	
	public void mostrar() {
		this.frame.setVisible(true);
	}
	
	public JButton getBoton1() {
		return boton1;
	}
	
	public JButton getBoton2() {
		return boton2;
	}
	
	public JButton getBoton3() {
		return boton3;
	}
}
