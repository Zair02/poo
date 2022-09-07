import java.util.Random;

public class NoDocente extends Personal{
	
	private TipoJornada jornada;

	public NoDocente(String nombre, String apellido, Integer antiguedad, String sector, TipoJornada jornada) {
		super(nombre, apellido, antiguedad, sector);
		this.jornada = jornada;
	}
	
	public String toString() {
		if (this.cumplioMinimo()) {
			return super.toString() + "\rJornada: " + jornada + "\tCumplio las horas mínimas: O";
		} else {
			return super.toString() + "\rJornada: " + jornada + "\tCumplio las horas mínimas: X";
		}
	}
	
	public boolean cumplioMinimo() {
		return getHorasTrabajadasMes() >= jornada.getHsMinimas();
	}
	
	public void generarHsTrabajadas() {
		Random rnd = new Random();
		switch(jornada) {
			case COMPLETA:
				if(rnd.nextDouble() <= 0.8) {
					setHorasTrabajadas(rnd.nextInt(30, 60));
				} else {
					setHorasTrabajadas(rnd.nextInt(0, 30));
				}
			break;
			case REDUCIDA:
				if(rnd.nextDouble() <= 0.8) {
					setHorasTrabajadas(rnd.nextInt(20, 50));
				} else {
					setHorasTrabajadas(rnd.nextInt(0, 20));
				}
			break;
				
		}
	}
	
}
