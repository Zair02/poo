package vista;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.*;

public class Vista {

	private JFrame frame = new JFrame("Tp4 Puntos 1 y 2");
	private JPanel panel;
	
	private JButton btnA;
	private JButton btnB;
	
	private JButton btnSeleccionarFile;
	private JButton btnGuardarFile;
	private JLabel lblArchivo;
	private JFileChooser fc = new JFileChooser();
	
	public Vista() {
		this.frame.setSize(300, 200);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new JPanel();
		this.generarPanel();
		this.frame.getContentPane().add(panel);
		
	}

	private void generarPanel() {
		panel.setLayout(null);
		
		btnA = new JButton("1A");
		btnA.setBounds(50, 40, 50, 30);
		this.panel.add(btnA);
		
		btnB = new JButton("1B");
		btnB.setBounds(50, 80, 50, 30);
		this.panel.add(btnB);
		
		btnSeleccionarFile = new JButton("Seleccionar");
		btnSeleccionarFile.setBounds(120, 40, 120, 30);
		this.panel.add(btnSeleccionarFile);
		
		btnGuardarFile = new JButton("Guardar");
		btnGuardarFile.setBounds(120, 80, 120, 30);
		this.panel.add(btnGuardarFile);
		
		lblArchivo = new JLabel("Archivos");
		lblArchivo.setHorizontalAlignment(JLabel.CENTER);
		lblArchivo.setBounds(120, 10, 120, 30);
		this.panel.add(lblArchivo);
	}
	
	public void generarBajaUsuario() {
		JOptionPane.showConfirmDialog(null, "Está seguro que quiere dar de baja al usuario");
	}
	
	public String generarPedirTexto() {
		return JOptionPane.showInputDialog("Ingrese un texto: ");
		
	}
	
	public void mostrarTexto(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public File elegirArchivo() {
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setDialogTitle("Seleccionar archivo");
		fc.showOpenDialog(panel);
		return fc.getSelectedFile();
	}
	
	public void guardarArchivo(File file) {
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setDialogTitle("Elegir ubicacion de destino");
		fc.showOpenDialog(panel);
		try {
			Files.move(Paths.get(file.getPath()), 
					Paths.get(fc.getSelectedFile().getPath() + "/" + file.getName()),
					StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void mostrar() {
		this.frame.setLocationRelativeTo(null);
		this.frame.setVisible(true);
	}

	public JButton getBtnA() {
		return btnA;
	}

	public JButton getBtnB() {
		return btnB;
	}
	
	public JButton getBtnSeleccioanrFile() {
		return btnSeleccionarFile;
	}
	
	public JButton getBtnGuardarFile() {
		return btnGuardarFile;
	}
}
