package tarifas;
public class TarifaMovistar extends TarifaProveedor {

	public TarifaMovistar() {
		this.nombre = "Movistar";
	} 
	
	public Double calcularConsumoGb(Double totalGigas) {
		return super.calcularConsumoGb(totalGigas) * 1.3;
	}

	public Double calcularMinutosLlamada(Integer totalMinutos) {
		return super.calcularMinutosLlamada(totalMinutos) * 1.2;
	}

	public Double calcularSMS(Integer totalSMS) {
		return super.calcularSMS(totalSMS) * 1.1;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
