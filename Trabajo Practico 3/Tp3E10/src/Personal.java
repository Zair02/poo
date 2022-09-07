
public abstract class Personal {

	private String nombre, apellido;
	private Integer antiguedad;
	private String sector;
	private Integer horasTrabajadasMes;

	public Personal(String nombre, String apellido, Integer antiguedad, String sector) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.sector = sector;
	}
	
	public String toString() {
		return apellido + " " + nombre + ":\tHoras trabajadas (Mes): " + horasTrabajadasMes; 
	}
	
	public abstract boolean cumplioMinimo();
	
	public abstract void generarHsTrabajadas();
	
	public Integer getHorasTrabajadasMes() {
		return horasTrabajadasMes;
	}

	public void setHorasTrabajadas(Integer horasTrabajadasSemana) {
		this.horasTrabajadasMes = horasTrabajadasSemana * 4;
	}
}
