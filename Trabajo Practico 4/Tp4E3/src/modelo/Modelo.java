package modelo;

import java.time.DateTimeException;
import java.time.LocalDate;

import excepciones.InputException;
import formatos.*;

public class Modelo {

	private String dia, mes, año;
	private Double cantidadDinero;
	private Formateo formateo;
	
	public void setFormato(String formato) {
		switch (formato) {
		case "ARG": formateo = new FormatoArg();
			break;
		case "US": formateo = new FormatoEEUU();
		break;
		}
	}
	
	public void setFecha(String dia, String mes, String año) throws InputException{
		if (año.length() < 4) {
			throw new InputException("Error. Se ingreso un formato de año invalido");
		}
		try {
		LocalDate.of(Integer.valueOf(año), Integer.valueOf(mes), Integer.valueOf(dia));
		}
		catch(DateTimeException e) {
			throw new InputException("Error. Se ingreso una fecha invalida");
		}
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}


	public void setCantidadDinero(Double cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}
	
	public String formatearMoneda() {
		return formateo.formatearMoneda(cantidadDinero);
	}

	public String formatearFecha() {
		return formateo.formatearFecha(dia, mes, año);
	}

}
