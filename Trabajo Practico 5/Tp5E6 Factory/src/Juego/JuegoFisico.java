package Juego;

public class JuegoFisico extends Juego{

	private Double precioTraslado;
	
	public JuegoFisico(Integer id, Double importe, Double precioTraslado) {
		this.id = id;
		this.importe = importe;
		this.precioTraslado = precioTraslado;
	}
	
	@Override
	public Double getPrecio() {
		return precioTraslado * importe;
	}
	
	public String toString() {
		return "Juego Fisico: " + super.toString(); 
	}

}
