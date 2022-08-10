
public class Persona {
	private Integer edad;
	private Character sexo;
	private Boolean estudia, trabaja;
	private static Integer censadas = 0;
	private static Integer cantidadTrabajan = 0;
	private static Double sumaEdades = 0.0;

	public Persona(Integer edad, Character sexo, Boolean estudia, Boolean trabaja) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.estudia = estudia;
		this.trabaja = trabaja;
		censadas++;
		sumaEdades += (double)edad;
		if (trabaja) {
			cantidadTrabajan++;
		}
	}

	public Integer getEdad() {
		return edad;
	}

	public Character getSexo() {
		return sexo;
	}

	public Boolean getEstudia() {
		return estudia;
	}

	public Boolean getTrabaja() {
		return trabaja;
	}

	public static Integer getCensadas() {
		return censadas;
	}
	
	public static Integer getCantidadTrabajan() {
		return cantidadTrabajan;
	}
	
	public static Double promedioEdades() {
		return sumaEdades/(double)censadas;
	}
	
}
