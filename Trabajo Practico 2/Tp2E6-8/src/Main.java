import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate fecha1 = LocalDate.of(2002, 2, 1);
		Persona persona1 = new Persona("Zair", "López", fecha1);
		System.out.println(persona1.toString());
		
		LocalDate fecha2 = LocalDate.of(2001, 8, 8);
		Persona persona2 = new Persona("Marcos", "Herrera", fecha2);
		System.out.println(persona2.toString());
		
		LocalDate fecha3 = LocalDate.of(2002, 1, 8);
		Persona persona3 = new Persona("Esteban", "Ramirez", fecha3);
		System.out.println(persona3.toString());
	}

}
