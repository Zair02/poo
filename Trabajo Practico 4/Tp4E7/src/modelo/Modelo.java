package modelo;

import java.util.ArrayList;

public class Modelo {
	
	private ArrayList<Empresa> empresas = new ArrayList<Empresa>();

	public String[][] getInformacion() {
		generarEmpresa();
		String[][] info = new String[totalFilas()][3];
		
		Integer i = 0;
		for (Empresa empresa : empresas) {
			for (Persona persona : empresa.getEmpleados()) {
				info[i][0] = empresa.getNombre();
				info[i][1] = persona.getNombre() + " " + persona.getApellido();
				info[i][2] = persona.getPuesto().getNombre();
				i++;
			}
		}
		return info;
	}
	
	private Integer totalFilas() {
		Integer filas = 0;
		for (Empresa empresa : empresas) {
			filas += empresa.getEmpleados().size();
		}
		System.out.println(filas);
		return filas;
	}
	
	private void generarEmpresa() {
		empresas.add(new Empresa("Empresa1", "San Martin 324"));
		empresas.add(new Empresa("Empresa2", "Sarmiento 2404"));
		empresas.add(new Empresa("Empresa3", "Belgrano 201"));
		
		empresas.get(0).añadirEmpleado(new Persona("Zair", "Lopez", null, new Puesto("Administrador")));
		empresas.get(0).añadirEmpleado(new Persona("Diego", "Vilte", null, new Puesto("Empleado")));
		empresas.get(1).añadirEmpleado(new Persona("Emiliano", "Chacoma", null, new Puesto("Empleado")));
		empresas.get(2).añadirEmpleado(new Persona("Matias", "Romero", null, new Puesto("Ingeniero")));
		empresas.get(2).añadirEmpleado(new Persona("Marcos", "Herrera", null, new Puesto("Administrador")));
		empresas.get(2).añadirEmpleado(new Persona("Facundo", "Villegas", null, new Puesto("Empleado")));
	}
}
