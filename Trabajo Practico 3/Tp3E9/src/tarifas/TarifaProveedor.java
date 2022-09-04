package tarifas;

public abstract class TarifaProveedor {
	
	protected String nombre;
	private Double valorSMS = 1.0;
	private Double valorLlamada = 15.0;
	private Double valorGigas = 20.0;
	
	public Double calcular(Integer totalSMS, Integer totalMinutos, Double totalGigas) {
		return calcularSMS(totalSMS) + calcularMinutosLlamada(totalMinutos) + calcularConsumoGb(totalGigas);
	}

	protected Double calcularConsumoGb(Double totalGigas) {
		return totalGigas * valorGigas;
	}

	protected Double calcularMinutosLlamada(Integer totalMinutos) {
		return totalMinutos * valorLlamada;
	}

	protected Double calcularSMS(Integer totalSMS) {
		return totalSMS * valorSMS;
	}
	
	public abstract String getNombre();

}
