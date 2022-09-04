
public class ProfesorTitular extends Profesor {

	private Integer antiguedad;
	private final Double valorAntiguedad = 1000.0;
	
	public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad) {
		super(nombre, apellido, edad, horasTrabajadas);
		this.antiguedad = antiguedad;
		setValorHora(300.0);
	}

	public Double getRemuneracionPorAntiguedad() {
		return this.valorAntiguedad * this.antiguedad;
	}
	
	public Double getRemuneracionMensual() {
		return super.getRemuneracionMensual() + getRemuneracionPorAntiguedad();
	}
}
