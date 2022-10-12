package Juego;

public class JuegoFactory implements Factory {

	public Juego crearJuego(String tipo, Integer id, Double importe, Double modificadorPrecio) {
		if (tipo.equals("FISICO")) {
			return new JuegoFisico(id, importe, modificadorPrecio);
		}
		if (tipo.equals("DIGITAL")) {
			return new JuegoDigital(id, importe, modificadorPrecio);
		} 
		return null;
	}

}
