import Juego.Juego;
import Juego.JuegoFactory;

public class Main {

	public static void main(String[] args) {
		
		JuegoFactory jf = new JuegoFactory();
		Juego juegoFisico = jf.crearJuego("FISICO", 123, 100.0, 5.0);
		Juego juegoDigital = jf.crearJuego("DIGITAL", 234, 75.0, 2.5);
		
		System.out.println(juegoDigital.toString());
		System.out.println(juegoFisico.toString());
	}
	
}
