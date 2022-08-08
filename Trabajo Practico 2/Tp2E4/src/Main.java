
public class Main {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();
		
		alumno1.setNombre("Alejandro");
		alumno1.setApellido("Rojas");
		alumno1.setDni(11111111);
		
		Alumno alumno2 = new Alumno("Martin", "Rosales");
		alumno2.setDni(11111112);
		
		System.out.println("Nombre y apellido: " + alumno1.getNombreYApellido() + " - DNI: " + alumno1.getDni());
		System.out.println("Nombre y apellido: " + alumno2.getNombreYApellido() + " - DNI: " + alumno2.getDni());
	}

}
