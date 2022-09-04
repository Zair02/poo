package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	
	private Vista vista;
	private Modelo modelo;

	public Controlador() {
		this.modelo = new Modelo();
		this.vista = new Vista();
		this.inicializarVista();
	}

	private void inicializarVista() {
		this.vista.getBotonCalcular().addActionListener(e -> this.calcularTarifa());;
		this.vista.mostrar();
	}

	private void calcularTarifa() {
		this.modelo.setTarifa(this.vista.getInputProveedor().getSelectedItem().toString());
		Double valorTarifa = this.modelo.calcularTarifa(
			Integer.valueOf(this.vista.getInputSMS().getText()),
			Integer.valueOf(this.vista.getInputMinLlamada().getText()),
			Double.parseDouble(this.vista.getInputGB().getText()));

		this.vista.getValorTarifa().setText(String.format("%.2f", valorTarifa));
	}
}
