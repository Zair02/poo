package controlador;

import excepciones.InputException;
import modelo.Modelo;
import vista.Vista;

public class Controlador {
	
	Vista vista = new Vista();
	Modelo modelo = new Modelo();
	
	public Controlador() {
		this.iniciarlizarVista();
	}

	private void iniciarlizarVista() {
		this.vista.getBtnFormatear().addActionListener(e -> this.formatear());
		this.vista.mostrar();
	}

	private void formatear() {
		this.modelo.setFormato(this.vista.getInputFormato());
		try {
			this.modelo.setFecha(this.vista.getInputDia(),
								this.vista.getInputMes(),
								this.vista.getInputAño());
			this.modelo.setCantidadDinero(this.vista.getInputMoneda());
		}
		catch(InputException e) {
			this.vista.cuadroExcepcion();
		}
		this.vista.setLblFormatoMoneda(this.modelo.formatearMoneda());
		this.vista.setLblFormatoFecha(this.modelo.formatearFecha());
	}
	
}
