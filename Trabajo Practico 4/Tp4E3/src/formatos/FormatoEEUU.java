package formatos;

public class FormatoEEUU implements Formateo{

	public String formatearMoneda(Double cantidad) {	
		return cantidad + " USD";
	}

	public String formatearFecha(String dia, String mes, String año) {
		return mes + "/" + dia + "/" + año;
	}
}
