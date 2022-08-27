
public class Soldado extends Personaje{

	public Soldado() {
		setVida(1000);
		setNivelAtaque(300);
		setNivelDefensa(10);
		setNombre("Soldado");
	}
	
	@Override
	public void defender(Integer dañoRecibido) {
		setVida(getVida() - (dañoRecibido * (1 - (getNivelDefensa()/100))));
		if (getVida() < 0) {
			setVida(0);
		}
	}
	
	public Integer atacar() {
		setNivelAtaque(getNivelAtaque() + 5);
		return super.atacar();
	}
	
	public String toString() {
		return "Soldado: " + super.toString(); 
	}
}
