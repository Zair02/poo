
public class Persona {
	private Integer edad;
	private Character sexo;
	private Boolean estudia, trabaja;

	public Persona(Integer edad, Character sexo, Boolean estudia, Boolean trabaja) {
		this.edad = edad;
		this.sexo = sexo;
		this.estudia = estudia;
		this.trabaja = trabaja; 
	}
	
	public Persona() {
		
	}

	public Integer getEdad() {
		return edad;
	}

	public Boolean getTrabaja() {
		return trabaja;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	public void setTrabaja(Boolean trabaja) {
		this.trabaja = trabaja;
	}
	
	public void setEstudia(Boolean estudia) {
		this.estudia = estudia;
	}
}
