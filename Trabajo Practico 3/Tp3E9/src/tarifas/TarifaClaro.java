package tarifas;
public class TarifaClaro extends TarifaProveedor {
	
	public TarifaClaro() {
		this.nombre = "Claro";
	}
	
	public Double calcular(Integer totalSMS, Integer totalMinutos, Double totalGigas) {
		return super.calcular(totalSMS, totalMinutos, totalGigas) * 1.2;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
