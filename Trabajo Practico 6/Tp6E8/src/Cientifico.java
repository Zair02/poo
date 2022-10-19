import java.util.LinkedList;

public class Cientifico extends Thread{

	private Servidor servidor;
	public LinkedList<PaqueteDato> colaPaquetes = new LinkedList<PaqueteDato>();
	
	public Cientifico(Servidor servidor) {
		this.servidor = servidor;
	}
	
	public void promediar(String nombreBoya, String tipoDato) {
		Integer cant = 0;
		Double sum = 0.0;
		for (PaqueteDato paqueteDato : colaPaquetes) {
			if (nombreBoya.equals(paqueteDato.getNombre())) {
				sum += paqueteDato.getDato(tipoDato);
				cant++;
			}
		}
		System.out.println("El promedio de " + tipoDato + " para la Boya " + nombreBoya + " es : " + (sum/cant));
	}

	@Override
	public void run() {
		Integer continuar = 0;
		while (continuar < 2) {
			PaqueteDato paquete = getCompartido().consultar();
			if (paquete != null) {
				colaPaquetes.add(paquete);
			} else {
				continuar++;
			}
		}
		System.out.println("\nINFORME DE PROMEDIOS: ");
		this.promediar("CIDMAR-1", "TEMPERATURA");
		this.promediar("CIDMAR-1", "VIENTO");
		this.promediar("CIDMAR-2", "TEMPERATURA");
		this.promediar("CIDMAR-2", "VIENTO");
	}

	private Servidor getCompartido() {
		return servidor;
	}
	
}
