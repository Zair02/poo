import java.util.Random;

public class Docente extends Personal{
	
	private CategoriaDoc categoria;
	
	public Docente(String nombre, String apellido, Integer antiguedad, String sector, CategoriaDoc categoria) {
		super(nombre, apellido, antiguedad, sector);
		this.categoria = categoria;
	}

	public String toString() {
		if (this.cumplioMinimo()) {
			return super.toString() + "\rCategoria: " + categoria + "\tCumplio las horas mínimas: O";
		} else {
			return super.toString() + "\rCategoria: " + categoria + "\tCumplio las horas mínimas: X";
		}	
	}

	public boolean cumplioMinimo() {
		return getHorasTrabajadasMes() >= categoria.getHsMinimas()*4;
	}
	
	public void generarHsTrabajadas() {
		Random rnd = new Random();
		switch(categoria) {
			case SIMPLE:
				if(rnd.nextDouble() >= 0.95) {
					setHorasTrabajadas(rnd.nextInt(10, 70));
				} else {
					setHorasTrabajadas(rnd.nextInt(0, 10));
				}
				break;
			case EXCLUSIVA:
				if(rnd.nextDouble() >= 0.75) {
					setHorasTrabajadas(rnd.nextInt(20, 75));
				} else {
					setHorasTrabajadas(rnd.nextInt(0, 20));
				}
				break;
			case SEMIEXCLUSIVA:
				if(rnd.nextDouble() >= 0.6) {
					setHorasTrabajadas(rnd.nextInt(40, 90));
				} else {
					setHorasTrabajadas(rnd.nextInt(0, 40));
				}
				break;
		}
	}
}
