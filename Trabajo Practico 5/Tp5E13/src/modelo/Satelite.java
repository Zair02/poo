package modelo;

import java.util.ArrayList;

public class Satelite extends RecolectorInfo{
	
	private Double nivelRadUv;
	
	public Satelite(Double nvlRad) {
		this.nivelRadUv = nvlRad;
		this.tipo = TipoInformante.SATELITE;
	}
	
	public void setNvlRad(Double nvlRad) {
		this.nivelRadUv = nvlRad;
		notificar();
	}
	
	public ArrayList<String> getInfo() {
		ArrayList<String> info = new ArrayList<String>();
		info.add("Nivel de Radiacion UV: " + nivelRadUv);
		return info;
	}
	
	public void suscribir(Suscriptor s) {
		suscriptores.add(s);
	}
	
	public void desuscribir(Suscriptor s) {
		suscriptores.remove(s);
	}

}
