import java.text.DecimalFormat;
import java.util.ArrayList;

public class Censo {

	private Integer famCensadas = 0; 
	private Integer persCensadas = 0;
	private Integer totalTrabajando = 0;
	private Double promedioEdad;
	
	public void calcularDatos(ArrayList<Familia> familias) {
		Integer sumatEdad = 0;
		for (Familia familia : familias) {
			if(familia.getCensada()) {
				this.famCensadas++;
				this.persCensadas += familia.getMiembros().size();
				this.totalTrabajando += familia.persTrabajando();
				for (Persona persona : familia.getMiembros()) {
					sumatEdad += persona.getEdad();
				}
			}
		}
		this.promedioEdad = (double)sumatEdad/(double)this.persCensadas;
	}
	
	public void imprimirDatos() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Familias censadas: " + famCensadas);
		System.out.println("Personas censadas: " + persCensadas);
		System.out.println("Personas que trabajan: " + totalTrabajando);
		System.out.println("Promedio de edad obtenido: " + df.format(promedioEdad));
	}
	
	public void habilitacionTrabajo(Persona persona) {
		if (persona.getEdad() >= 16) {
			System.out.println("La persona está habilitada para trabajar");
		} else {
			System.out.println("La persona no cumple con la edad para trabajar");
		}
	}
	
	public void habilitacionManejo(Persona persona) {
		if (persona.getEdad() >= 17) {
			System.out.println("La persona está habilitada para obtener la licencia B");
		} else {
			System.out.println("La persona no cumple con la edad para obtener una licencia B");
		}
	}
	
}
