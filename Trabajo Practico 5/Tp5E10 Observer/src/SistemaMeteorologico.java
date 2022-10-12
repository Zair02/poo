import java.util.ArrayList;

public class SistemaMeteorologico{

	private String estadoClima;
	private ArrayList<cambioClimaListener> suscriptores = new ArrayList<cambioClimaListener>();

	public SistemaMeteorologico(String clima) {
		this.estadoClima = clima;
	}
	
	public void suscribir(cambioClimaListener c) {
		suscriptores.add(c);
	}
	
	public void desuscribir(cambioClimaListener c) {
		suscriptores.remove(c);
	}
	
	public void notificar() {
		for (cambioClimaListener suscriptor : suscriptores) {
			suscriptor.update(estadoClima);
		}
	}
	
	public void setClima(String clima) {
		this.estadoClima = clima;
		this.notificar();
	}
}
