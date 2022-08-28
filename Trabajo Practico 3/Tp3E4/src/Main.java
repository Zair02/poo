
public class Main {

	public static void main(String[] args) {
		
		Combate combate = new Combate();
		
		for (int i = 0; i < 3; i++) {
			Tanque tanque = new Tanque();
			Soldado soldado = new Soldado();
			combate.combatir(tanque, soldado);
		}
	}
}
