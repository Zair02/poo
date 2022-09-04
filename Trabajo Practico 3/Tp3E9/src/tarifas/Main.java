package tarifas;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		TarifaClaro tarC = new TarifaClaro();
		TarifaMovistar tarM = new TarifaMovistar();
		TarifaPersonal tarP = new TarifaPersonal();
		
		ArrayList<TarifaProveedor> tarifas = new ArrayList<TarifaProveedor>();
		tarifas.add(tarP);
		tarifas.add(tarM);
		tarifas.add(tarC);
		
		for (TarifaProveedor tarifa : tarifas) {
			System.out.println("El valor de la tarifa de " + tarifa.getNombre() + 
					" es: " + tarifa.calcular(50, 200, 43.4));
		}
	}

}
