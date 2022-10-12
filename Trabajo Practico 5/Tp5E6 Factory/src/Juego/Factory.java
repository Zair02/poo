package Juego;

public interface Factory {

	public Juego crearJuego(String tipo, Integer id, Double importe, Double modificadorPrecio);
	
}
