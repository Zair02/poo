package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador() {
		inicializarVista();
		vista.mostrar();
	}

	private void inicializarVista() {
		this.vista.getBtnGenerar().addActionListener(e -> this.vista.generarTabla(this.modelo.getInformacion()));
	}
}
