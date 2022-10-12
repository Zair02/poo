import java.util.ArrayList;

public class CatalogoMenores18 implements StrategyCatalogo{

	@Override
	public ArrayList<Pelicula> getCatalogo(ArrayList<Pelicula> catalogo) {
		ArrayList<Pelicula> filtrado = new ArrayList<Pelicula>();
		for (Pelicula pelicula : catalogo) {
			if (!pelicula.getCategoria().equals("+18")) {
				filtrado.add(pelicula);
			}
		}
		return filtrado;
	}

}
