
public class Tanque extends Personaje {
	
	public Tanque() {
		setVida(2000);
		setNivelAtaque(150);
		setNivelDefensa(50);
		setNombre("Tanque");
	}
	
	@Override
	public void defender(Integer dañoRecibido) {
		setVida(getVida() - (dañoRecibido * (1 - (getNivelDefensa()/100))));
		setNivelDefensa(getNivelDefensa() + 5);
		if (getVida() < 0) {
			setVida(0);
		}
	}
	
	public String toString() {
		return "Tanque: " + super.toString(); 
	}

}
