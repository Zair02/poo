package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	
	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador() {
		inicializarVista();
	}

	private void inicializarVista() {
		this.vista.getBtnTraducir().addActionListener(e -> traducirMensaje());
		this.vista.mostrar();
	}

	private void traducirMensaje() {
		this.modelo.setIdioma(this.vista.getInputIdioma());
		this.modelo.setMensaje(this.vista.getInputMensaje());
		this.vista.setTraduccion(this.modelo.getTraduccion());
	}
}
