import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Familia> familias = generarFamilias();
		Censo censo = new Censo();
		censo.calcularDatos(familias);
		censo.imprimirDatos();
		
	}
	
	public static ArrayList<Familia> generarFamilias(){
		ArrayList<Familia> familias = new ArrayList<Familia>();
		Random rnd = new Random();
		
		for(int i = 0; i < 4; i++) {
			Familia familia = new Familia();
			familia.setCensada(rnd.nextBoolean());
			System.out.println("\rFamilia " + i + "\tCensada: " + familia.getCensada());
			int miembros = rnd.nextInt(1, 6);
			if (familia.getCensada()) {
				for (int j = 0; j < miembros; j++) {
					Persona persona = new Persona();
					persona.setEdad(rnd.nextInt(1, 100));
					persona.setEstudia(rnd.nextBoolean());
					persona.setTrabaja(rnd.nextBoolean());
					persona.setSexo("MF".charAt(rnd.nextInt(0, 2)));
					familia.añadirMiembro(persona);
					System.out.println("Persona " + j + "\tEdad: " + persona.getEdad() + "\tTrabaja: " + persona.getTrabaja());
				}
			}
			familias.add(familia);
		}
		return familias;
	}
	
	
}
