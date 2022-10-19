package modelo;

import java.util.ArrayList;

public class BoyaMarina extends RecolectorInfo{
	
	private Double temperaturaMar, salinidadMar;
	
	public BoyaMarina(Double temperaturaMar, Double salinidadMar) {
		this.salinidadMar = salinidadMar;
		this.temperaturaMar = temperaturaMar;
		this.tipo = TipoInformante.BOYA_MARITIMA;
	}
	
	public void setTemperatura(Double temperatura) {
		this.temperaturaMar = temperatura;
		notificar();
	}
	
	public void setSalinidad(Double salinidad) {
		this.salinidadMar = salinidad;
		notificar();
	}
	
	public ArrayList<String> getInfo() {
		ArrayList<String> info = new ArrayList<String>();
		info.add("Temperatura del Mar: " + temperaturaMar);
		info.add("Salinidad del Mar: " + salinidadMar);
		return info;
	}
	
	public void suscribir(Suscriptor s) {
		suscriptores.add(s);
	}
	
	public void desuscribir(Suscriptor s) {
		suscriptores.remove(s);
	}

}
