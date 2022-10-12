package Juego;

public class JuegoDigital extends Juego{
	
	private Double precioPlataforma;

	public JuegoDigital(Integer id, Double importe, Double precioPlataforma) {
		this.id = id;
		this.importe = importe;
		this.precioPlataforma = precioPlataforma;
	}
	
	@Override
	public Double getPrecio() {
		return importe * precioPlataforma;
	}
	
	public String toString() {
		return "Juego Digital: " + super.toString(); 
	}

}
