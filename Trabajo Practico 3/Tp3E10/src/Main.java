import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Personal> personal = new ArrayList<Personal>();
		
		for(int i = 0; i < 10; i++) {
			if(rnd.nextBoolean()) {
				personal.add(new NoDocente("NoDocente" + i, "Apellido", rnd.nextInt(0, 51), 
						"Sector" + i, TipoJornada.values()[rnd.nextInt(0, 2)]));
			} else {
				personal.add(new Docente("Docente" + i, "Apellido", rnd.nextInt(0, 51), 
						"Sector" + i, CategoriaDoc.values()[rnd.nextInt(0, 3)]));
			}
			personal.get(i).generarHsTrabajadas();
		}
		
		Reloj reloj = new Reloj();
		reloj.generarInforme(personal);

	}

}
