public class Main {

	public static void main(String[] args) {
		Loteria loteria = new Loteria();
		do {
			loteria.ingresarNumeros();
			loteria.generarResultado();
			loteria.coincidencias();
			loteria.resultadoFinal();
			loteria.reiniciarLoteria();
		} while(loteria.continuar());
	}
	
}
