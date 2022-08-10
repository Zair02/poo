
public class Main {
	
	public static void main(String[] args) {
		Familia familia1 = new Familia();
		Familia familia2 = new Familia();
		Familia familia3 = new Familia();
		
		Persona persona1 = new Persona(44, 'M', false, true);
		Persona persona2 = new Persona(42, 'F', false, true);
		Persona persona3 = new Persona(19, 'M', true, false);
		Persona persona4 = new Persona(15, 'F', true, false);
		Persona persona5 = new Persona(29, 'F', true, true);
		Persona persona6 = new Persona(28, 'M', true, true);		
		Persona persona7 = new Persona(23, 'M', true, false);
		
		familia1.añadirMiembro(persona1);
		familia1.añadirMiembro(persona2);
		familia1.añadirMiembro(persona3);
		familia1.añadirMiembro(persona4);
		
		familia2.añadirMiembro(persona5);
		familia2.añadirMiembro(persona6);
		
		familia3.añadirMiembro(persona7);
		
		System.out.println("Familias censadas: " + Familia.getCensadas());
		System.out.println("Personas censadas: " + Persona.getCensadas());
		System.out.println("Personas que trabajan: " + Persona.getCantidadTrabajan());
		System.out.println("Promedio de edad obtenido: " + Persona.promedioEdades());
		
	}
}
