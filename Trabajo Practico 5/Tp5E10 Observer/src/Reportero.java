
public class Reportero implements cambioClimaListener{

	@Override
	public void update(String estadoClima) {
		System.out.println("Estado actual del clima: " + estadoClima);
	}
	
}
