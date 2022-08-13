import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("Empresa 1", "calle 123abc");
		
		for(int i = 0; i < 5; i++) {
			Puesto puesto = new Puesto("Administrativo");
			if (i == 3) {
				puesto.setNombre("Gerente");
			} else if (i == 4) {
				puesto.setNombre("Tesorero");
			}
			Persona persona = new Persona("Nombre" + i, "Apellido" + i, LocalDate.of(2002 - i*2, 1 + i, 8), puesto);
			empresa.añadirEmpleado(persona);
		}
		
		for (Persona persona : empresa.getEmpleados()) {
			System.out.println(persona.toString() + "\r");
		}
	}

}
