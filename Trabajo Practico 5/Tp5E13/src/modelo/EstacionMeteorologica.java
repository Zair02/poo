package modelo;

import java.util.ArrayList;

public class EstacionMeteorologica extends RecolectorInfo{
	
	private Double temperatura, presionAtm, velocidadViento;
	
	public EstacionMeteorologica(Double temperatura, Double presionAtm, Double velocidadViento) {
		this.temperatura = temperatura;
		this.presionAtm = presionAtm;
		this.velocidadViento = velocidadViento;
		this.tipo = TipoInformante.ESTACION_METEOROLGICA;
	}

	public void setTemperatura(Double temp) {
		this.temperatura = temp;
		notificar();
	}
	
	public void setPresion(Double presion) {
		this.presionAtm = presion;
		notificar();
	}
	
	public void setVelocidad(Double velocidad) {
		this.velocidadViento = velocidad;
		notificar();
	}
	
	public ArrayList<String> getInfo() {
		ArrayList<String> info = new ArrayList<String>();
		info.add("Temperatura: " + temperatura);
		info.add("Presion Atmosferica: " + presionAtm);
		info.add("Velocidad del Viento:" + velocidadViento);
		return info;
	}

}
