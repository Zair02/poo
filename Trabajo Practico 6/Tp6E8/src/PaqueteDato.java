
public class PaqueteDato {

	private String nombreBoya;
	private Double temperatura;
	private Double velocidadViento;
	private long tiempo;
	
	public PaqueteDato(String nombre, Double temperatura, Double velocidadViento) {
		this.nombreBoya = nombre;
		this.temperatura = temperatura;
		this.velocidadViento = velocidadViento;
		this.tiempo = System.currentTimeMillis();
	}

	public String toString() {
		return "PaqueteDatos [NombreBoya = " + nombreBoya + ", Temperatura = " +
				temperatura + ", Velocidad del Viento = " + velocidadViento + 
				", Tiempo = " + tiempo + "]";
	}

	public Double getDato(String tipoDato) {
		if (tipoDato.equals("TEMPERATURA")) {
			return temperatura;
		}
		if (tipoDato.equals("VIENTO")) {
			return velocidadViento;
		}
		return null;
	}

	public String getNombre() {
		return nombreBoya;
	}
	
}
