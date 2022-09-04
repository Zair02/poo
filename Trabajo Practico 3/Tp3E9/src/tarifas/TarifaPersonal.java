package tarifas;
public class TarifaPersonal extends TarifaProveedor{

	public TarifaPersonal() {
		this.nombre = "Personal";
	}
	
	public Double calcularConsumoGb(Double totalGigas) {
		return super.calcularConsumoGb(totalGigas) * 1.5;
	}

	public Double calcularMinutosLlamada(Integer totalMinutos) {
		return super.calcularMinutosLlamada(totalMinutos) * 1.2;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
