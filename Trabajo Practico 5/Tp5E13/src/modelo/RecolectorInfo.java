package modelo;

import java.util.ArrayList;

public abstract class RecolectorInfo {
	
	protected ArrayList<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
	protected TipoInformante tipo;
	
	public abstract ArrayList<String> getInfo();
	
	public void notificar() {
		for (Suscriptor suscriptor : suscriptores) {
			suscriptor.actualizar(getInfo(), tipo);
		}
	}
	
	public void suscribir(Suscriptor s) {
		suscriptores.add(s);
	}
	
	public void desuscribir(Suscriptor s) {
		suscriptores.remove(s);
	}
	
}
