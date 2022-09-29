package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Vista {
	
	private JFrame frame = new JFrame("Juego de memoria");
	
	private JPanel panelJuego, panelSup;
	
	private JButton btnIniciar;
	private JPanel[] colores = new JPanel[12];
	private JButton[] botones = new JButton[12];
	private JLabel lblTimer;
	
	public Vista() {
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelSup = new JPanel();
		generarPanelSup();
		frame.getContentPane().add(panelSup, BorderLayout.NORTH);
		
		panelJuego = new JPanel(new GridLayout(3, 4));
		generarPanelJuego();
		frame.getContentPane().add(panelJuego, BorderLayout.CENTER);
	}

	private void generarPanelJuego() {
		for (int i = 0; i < 12; i++) {
			colores[i] = new JPanel(new BorderLayout());
			colores[i].setSize(100, 150);
			colores[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panelJuego.add(colores[i]);
			
			botones[i] = new JButton();
			botones[i].setEnabled(false);
			botones[i].setOpaque(false);
			botones[i].setContentAreaFilled(false);

			colores[i].add(botones[i], BorderLayout.CENTER);
		}
	}

	private void generarPanelSup() {		
		btnIniciar = new JButton("Inicar Partida");
		panelSup.add(btnIniciar);
		
		lblTimer = new JLabel("00:00");
		panelSup.add(lblTimer);
	}
	
	public void actualizarTiempo(String tiempo) {
		lblTimer.setText(tiempo);
	}

	public void pintarTablero(ArrayList<Color> colores) {
		for (int i = 0; i < this.colores.length; i++) {
			this.colores[i].setBackground(colores.get(i));
		}
	}
	
	public void mostrar() {
		frame.setVisible(true);
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}

	public void sacarColores(HashMap<Color, Boolean> estadoColores, ArrayList<Color> colores) {
		for (int i = 0; i < this.colores.length; i++) {
			if (!estadoColores.get(colores.get(i))) {
				this.colores[i].setBackground(Color.GRAY);
			}
		}
	}

	public JButton getBtnColor(Integer pos) {
		return botones[pos];
	}
	
	public void pintarCelda(Integer pos, Color color) {
		this.colores[pos].setBackground(color);
	}

	public void mensajeTerminar(String tiempoFinal) {
		JOptionPane.showMessageDialog(frame, "Felicidades! Completaste el juego en: " + tiempoFinal);
	}
	
	public void habilitarJuego() {
		for (JButton btn : botones) {
			btn.setEnabled(true);
		}
	}
}
