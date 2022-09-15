package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador() {
		this.inicializarVista();
	}

	private void inicializarVista() {
		this.vista.mostrar();
		this.vista.getBtnA().addActionListener(e -> this.generarDialogoA());
		this.vista.getBtnB().addActionListener(e -> this.generarDialogoB());
		this.vista.getBtnSeleccioanrFile().addActionListener(e -> this.accionBtnArchivos());
		this.vista.getBtnGuardarFile().addActionListener(e -> this.guardarArchivo());
	}

	private void generarDialogoA() {
		this.vista.generarBajaUsuario();
	}
	
	private void generarDialogoB() {
		this.modelo.setTexto(vista.generarPedirTexto());
		this.vista.mostrarTexto(this.modelo.generarMsj());
	}
	
	private void accionBtnArchivos() {
		this.modelo.setFile(vista.elegirArchivo());
	}
	
	private void guardarArchivo() {
		this.vista.guardarArchivo(this.modelo.getFile());
	}
}
