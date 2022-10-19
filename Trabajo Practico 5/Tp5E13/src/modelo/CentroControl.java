package modelo;

import java.util.ArrayList;

public class CentroControl implements Suscriptor{

	private ArrayList<String> infoSatelite = new ArrayList<String>();
	private ArrayList<String> infoBoya = new ArrayList<String>();
	private ArrayList<String> infoEstacion = new ArrayList<String>();
	
	public CentroControl() {}

	@Override
	public void actualizar(ArrayList<String> info, TipoInformante tipo) {
		switch(tipo) {
		case ESTACION_METEOROLGICA:
			infoEstacion = info;
			break;
		case BOYA_MARITIMA:
			infoBoya = info;
			break;
		case SATELITE:
			infoSatelite = info;
			break;
		}
		this.mostrarInfo();
	}
	
	public void mostrarInfo() {
		ArrayList<String> informacion = new ArrayList<String>();
		informacion.addAll(infoEstacion);
		informacion.addAll(infoBoya);
		informacion.addAll(infoSatelite);
		for(String st : informacion) {
			System.out.println(st);
		}
		System.out.println();
	}
	
}
