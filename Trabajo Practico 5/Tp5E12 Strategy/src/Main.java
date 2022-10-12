
public class Main {

	public static void main(String[] args) {
		
		Plataforma plataforma = new Plataforma();
		
		plataforma.añadirPeli(new Pelicula("Pelicula1", "+18"));
		plataforma.añadirPeli(new Pelicula("Pelicula2", "+13"));
		plataforma.añadirPeli(new Pelicula("Pelicula3", "+18"));
		plataforma.añadirPeli(new Pelicula("Pelicula4", "ATP"));
		plataforma.añadirPeli(new Pelicula("Pelicula5", "ATP"));
		plataforma.añadirPeli(new Pelicula("Pelicula6", "+13"));
		plataforma.añadirPeli(new Pelicula("Pelicula7", "+18"));
		
		Cuenta cuenta1 = new Cuenta(17, "Usuario2");
		Cuenta cuenta2 = new Cuenta(12, "Usuario3");
		Cuenta cuenta3 = new Cuenta(24, "Usuario1");
		
		plataforma.cambiarCuenta(cuenta1);
		plataforma.mostrarCatalogo();
		plataforma.cambiarCuenta(cuenta2);
		plataforma.mostrarCatalogo();
		plataforma.cambiarCuenta(cuenta3);
		plataforma.mostrarCatalogo();
	}
	
}
