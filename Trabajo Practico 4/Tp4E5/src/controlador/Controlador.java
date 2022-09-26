package controlador;

import modelo.ExcepcionDivCero;
import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador() {
		inicilizarVista();
		vista.mostrar();
	}

	private void inicilizarVista() {
		this.vista.getBtnCalcular().addActionListener(e -> realizarCalculo());
		this.vista.getBtnMostrar().addActionListener(e -> mostrarOperacion());
		this.vista.getBtnBorrar().addActionListener(e -> this.vista.limpiarDisplay());
	}

	private void mostrarOperacion() {
		this.modelo.setOperacion(this.vista.getOperador1(), this.vista.getOperador2(), this.vista.getInputOperacion());
		try {
			this.vista.setResultado(this.modelo.getOperacion());
		} catch (NumberFormatException e) {
			this.vista.mostrarErrorInput();
		}
	}

	private void realizarCalculo() {
		this.modelo.setOperacion(this.vista.getOperador1(), this.vista.getOperador2(), this.vista.getInputOperacion());
		try {
			this.vista.setResultado(String.valueOf(this.modelo.getResultadoOperacion()));
		} catch (ExcepcionDivCero e) {
			this.vista.mostrarDivisionPorCero();
		} catch (NumberFormatException e) {
			this.vista.mostrarErrorInput();
		}
	}
}
