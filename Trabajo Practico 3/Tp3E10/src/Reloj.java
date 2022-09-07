import java.util.ArrayList;

public class Reloj {

	public void generarInforme(ArrayList<Personal> personal) {
		for (Personal persona : personal) {
			System.out.println(persona.toString() + "\r");
		}
	}
	
	public void generarInforme(Personal personal) {
		System.out.println(personal.toString());
	}
}
