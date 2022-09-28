package modelo;

import java.time.LocalDate;

public class Modelo {
	
	private Empresa empresa;

	public String[][] getInformacion() {
		generarEmpresa();
		String[][] info = new String[empresa.getEmpleados().size()][3];
		for (int i = 0; i < empresa.getEmpleados().size(); i++) {
			info[i][0] = empresa.getEmpleados().get(i).getNombre() + " " + empresa.getEmpleados().get(i).getApellido();
			info[i][1] = empresa.getEmpleados().get(i).getFechaNacimiento().toString();
			info[i][2] = empresa.getEmpleados().get(i).getPuesto().getNombre();
		}
		return info;
	}
	
	public String getNombreEmpresa() {
		return empresa.getNombre();
	}
	
	private void generarEmpresa() {
		empresa = new Empresa("Empresa", "San Martin 324");
		empresa.añadirEmpleado(new Persona("Zair", "Lopez", LocalDate.of(2002, 2, 1), new Puesto("Administrador")));
		empresa.añadirEmpleado(new Persona("Diego", "Vilte", LocalDate.of(2002, 1, 29), new Puesto("Empleado")));
		empresa.añadirEmpleado(new Persona("Emiliano", "Chacoma", LocalDate.of(2001, 8, 24), new Puesto("Empleado")));
		empresa.añadirEmpleado(new Persona("Matias", "Romero", LocalDate.of(2001, 9, 20), new Puesto("Ingeniero")));
		empresa.añadirEmpleado(new Persona("Marcos", "Herrera", LocalDate.of(2001, 8, 24), new Puesto("Administrador")));
	}
}
