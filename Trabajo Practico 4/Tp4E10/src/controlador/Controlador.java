package controlador;

import javax.swing.Timer;

import modelo.Juego;
import vista.Vista;

public class Controlador {

	private Vista vista = new Vista();
	private Juego juego = new Juego();
	private Timer timer;
	
	public Controlador() {
		this.inicializarVista();
		this.vista.mostrar();
	}

	private void inicializarVista() {
		this.vista.pintarTablero(this.juego.generarColores());
		this.vista.getBtnIniciar().addActionListener(e -> this.iniciarJuego());
		seleccionPaneles();
	}

	private void seleccionPaneles() {
		for (int i = 0; i < this.juego.getColores().size(); i++) {
			Integer j = i;
			this.vista.getBtnColor(i).addActionListener(e -> estadoJuego(j));;
		}
	}
	
	private void estadoJuego(Integer pos) {
		
		if (this.juego.reiniciarPaneles()) {
			this.vista.sacarColores(this.juego.getEstadoColores(), this.juego.getColores());
		}
		
		this.vista.pintarCelda(pos, this.juego.getColores().get(pos));
		
		if (juego.getPanel(1) == null) {
			this.juego.setPanel1(pos);
		} else if (juego.getPanel(2) == null) {
			this.juego.setPanel2(pos);
			this.juego.compararPaneles();
		} 

		terminarJuego();
	}

	private void terminarJuego() {
		if (this.juego.terminarJuego()) {
			this.timer.stop();
			this.vista.mensajeTerminar(this.juego.getTiempoTranscurrido());
			this.juego.generarColores();
		} 
	}

	private void iniciarJuego() {
		this.vista.sacarColores(this.juego.getEstadoColores(), this.juego.getColores());
		this.juego.iniciarTiempo();
		this.vista.habilitarJuego();
		this.timer = new Timer(0, e -> this.vista.actualizarTiempo(this.juego.getTiempoTranscurrido()));
		this.timer.start();
	}
	
	
}
