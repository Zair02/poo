
public class ProfesorSuplente extends Profesor {

	public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super(nombre, apellido, edad, horasTrabajadas);
		setValorHora(200.0);
	}
	
}
