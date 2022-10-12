package Juego;

public abstract class Juego {
	
	protected Integer id;
	protected Double importe;
	
	public abstract Double getPrecio();
	
	public String toString() {
		return "Id: " + id + "\tPrecio: " + getPrecio(); 
	}
	
}
