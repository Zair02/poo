import java.util.ArrayList;

public class CatalogoMenores13 implements StrategyCatalogo{

	@Override
	public ArrayList<Pelicula> getCatalogo(ArrayList<Pelicula> catalogo) {
		ArrayList<Pelicula> filtrado = new ArrayList<Pelicula>();
		for (Pelicula pelicula : catalogo) {
			if (pelicula.getCategoria().equals("ATP")) {
				filtrado.add(pelicula);
			}
		}
		return filtrado;
	}

}
