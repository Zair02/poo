import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Materia poo = new Materia("POO", "IF153");
		Materia algebra = new Materia("Álgebra", "183");
		Materia introduccion = new Materia("Introducción a la computación", "IF300");
		Materia algoritmica = new Materia("Algorítmica", "500");
		
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez");
		profesor1.añadirMateria(poo);
		profesor1.añadirMateria(algebra);
		profesores.add(profesor1);
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez");
		profesor2.añadirMateria(algoritmica);
		profesor2.añadirMateria(introduccion);
		profesores.add(profesor2);
		
		Profesor profesor3 = new Profesor("Laura", "Perez");
		profesores.add(profesor3);
		
		for (int i = 0; i < profesores.size(); i++) {
			System.out.println("\rProfesor: " + profesores.get(i).getNombre() + " " + profesores.get(i).getApellido());
			System.out.println("Materias: ");
			for (int j = 0; j < profesores.get(i).getMaterias().size(); j++) {
				System.out.println(profesores.get(i).getMaterias().get(j).getNombre());
			}
		}
	}

}
