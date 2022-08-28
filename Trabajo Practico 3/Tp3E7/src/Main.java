import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Persona> personas = new ArrayList<Persona>();

		for (int i = 0; i < 10; i++) {
			if(rnd.nextBoolean()) {
				personas.add(new Docente("NomDoc" + i, "ApecDoc" + i, "Mat" + i));
			} else {
				Alumno alumno = new Alumno("AlumNom" + i, "AlumApe" + i);
				for (int j = 0; j < 9; j++) {
					alumno.agregarMateria("Mat" + j);
					if(rnd.nextBoolean()) {
						break;
					}
				}
				personas.add(alumno);
			}
		}
		for(Persona persona : personas) {
			System.out.println(persona.materia());
		}
		System.out.println("\n");
		for(Persona persona : personas) {
			System.out.println(persona.materia("Mat" + rnd.nextInt(9)));
			
		}
		
	}

}
