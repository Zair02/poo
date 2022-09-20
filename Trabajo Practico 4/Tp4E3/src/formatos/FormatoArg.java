package formatos;

public class FormatoArg implements Formateo{

	public String formatearMoneda(Double cantidad) {
		return cantidad + " ARS";
	}

	public String formatearFecha(String dia, String mes, String año) {
		return dia + "/" + mes + "/" + año;
	}

}
