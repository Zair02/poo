import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<ProfesorTitular> titulares = new ArrayList<ProfesorTitular>();
		titulares.add(new ProfesorTitular("Aldana", "Gutierrez", 40, 40, 15));
		titulares.add(new ProfesorTitular("Pedro", "Perez", 30, 30, 4));
		titulares.add(new ProfesorTitular("María", "Gomez", 29, 40, 1));
		
		ArrayList<ProfesorSuplente> suplentes = new ArrayList<ProfesorSuplente>();
		suplentes.add(new ProfesorSuplente("Tomas", "Sosa", 28, 40));
		suplentes.add(new ProfesorSuplente("Luciana", "Torres", 35, 10));
		
		for (int i = 0; i < titulares.size(); i++) {
			System.out.println("\nNombre y apellido: " + titulares.get(i).getNombre() + " " +
					titulares.get(i).getApellido());
			System.out.println("¿Es titular?: Sí");
			System.out.println("Remuneración: " +
					titulares.get(i).getRemuneracionMensual());
		}
		
		for (int i = 0; i < suplentes.size(); i++) {
			System.out.println("\nNombre y apellido: " + suplentes.get(i).getNombre() + " " +
					suplentes.get(i).getApellido());
			System.out.println("¿Es titular?: No");
			System.out.println("Remuneración: " +
					suplentes.get(i).getRemuneracionMensual());
		}
	}
}
