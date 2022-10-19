import modelo.*;

public class Main {

	public static void main(String[] args) {
		//Controlador c = new Controlador();
		CentroControl cc = new CentroControl();
		Satelite s = new Satelite(23.1);
		BoyaMarina bm = new BoyaMarina(2.1, 3.0);
		EstacionMeteorologica em = new EstacionMeteorologica(1.5, 24.2, 23.1);
		
		em.suscribir(cc);
		s.suscribir(cc);
		bm.suscribir(cc);
		
		em.setPresion(2.3);
		s.setNvlRad(5.33);
		em.setPresion(5.2);
	}
	
}
