package modelo;

import tarifas.*;

public class Modelo {
	
	private TarifaProveedor tarifa;
	
	public Double calcularTarifa(Integer totalSMS, Integer totalMin, Double totalGB) {
		return tarifa.calcular(totalSMS, totalMin, totalGB);
	}
	
	public void setTarifa(String proveedor) {
		if (proveedor.equals("Claro")){
			tarifa = new TarifaClaro();
		} else if (proveedor.equals("Personal")) {
			tarifa = new TarifaPersonal();
		} else if (proveedor.equals("Movistar")) {
			tarifa = new TarifaMovistar();
		} else {
			throw new IllegalArgumentException("Error. Proveedor invalido");
		}
	}

}
