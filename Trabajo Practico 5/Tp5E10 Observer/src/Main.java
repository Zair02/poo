
public class Main {

	public static void main(String[] args) {
		
		SistemaMeteorologico sm = new SistemaMeteorologico("Lluvioso");
		
		Reportero r1 = new Reportero();
		sm.suscribir(r1);
		Reportero r2 = new Reportero();
		sm.suscribir(r2);
		
		sm.setClima("Nevando");
		sm.setClima("Granizando");
		
		sm.desuscribir(r1);
		
		sm.setClima("Ventoso");
		
	}

}
