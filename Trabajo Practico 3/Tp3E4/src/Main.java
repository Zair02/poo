
public class Main {

	public static void main(String[] args) {
		Tanque tanque = new Tanque();
		Soldado soldado = new Soldado();
		
		Combate combate1 = new Combate();
		
		for (int i = 0; i < 3; i++) {
			combate1.combatir(tanque, soldado);
		}
		
	}

}
