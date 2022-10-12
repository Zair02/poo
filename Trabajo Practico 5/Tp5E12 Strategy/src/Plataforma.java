import java.util.ArrayList;

public class Plataforma {
	
	private ArrayList<Pelicula> catalogo = new ArrayList<Pelicula>();
	private Cuenta cuentaActiva;

	public Plataforma() {
		
	}
	
	public void añadirPeli(Pelicula pelicula) {
		catalogo.add(pelicula);
	}
	
	public void mostrarCatalogo() {
		for (Pelicula pelicula : getCatalogo()) {
			System.out.println(pelicula.getTitulo() + "   Clasificacion: " + pelicula.getCategoria());
		}
	}
	
	private ArrayList<Pelicula> getCatalogo() {
		System.out.println("");
		if (cuentaActiva.getEdad() < 13) {
			return new CatalogoMenores13().getCatalogo(catalogo);
		} else if (cuentaActiva.getEdad() < 18) {
			return new CatalogoMenores18().getCatalogo(catalogo);
		} else {
			return new CatalogoGeneral().getCatalogo(catalogo);
		}
	}
	
	public void cambiarCuenta(Cuenta cuenta) {
		this.cuentaActiva = cuenta;
	}
}
