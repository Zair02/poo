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
		this.vista.getBtnGenerar().addActionListener(e -> this.accionGenerar());
		this.vista.getBtnBorrar().addActionListener(e -> this.accionBorrar());
	}
	
	private void accionGenerar() {
		this.vista.generarTabla(this.modelo.getInformacion());
		this.vista.getTabla().getSelectionModel().addListSelectionListener(e -> this.vista.habilitarBtnBorrar());
	}

	private void accionBorrar() {
		this.vista.borrarFila();
	}
}