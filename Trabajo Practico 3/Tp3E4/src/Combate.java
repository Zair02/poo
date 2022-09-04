import java.util.Random;

public class Combate {
	
	private Integer nroTurno;
	private Boolean finCombate;
	
	public Combate() {
		
	}
	
	public void combatir(Personaje pers1, Personaje pers2) {
		finCombate = false;
		nroTurno = 1;
		while(!finCombate) {
			System.out.println("\rTurno: " + nroTurno);
			Random rdm = new Random();
			if (rdm.nextBoolean()) {
				accionPersonaje(pers1, pers2);
				if (finCombate) {
					break;
				}
				accionPersonaje(pers2, pers1);
			} else {
				accionPersonaje(pers2, pers1);
				if (finCombate) {
					break;
				}
				accionPersonaje(pers1, pers2);
			}
			nroTurno++;
		}
		System.out.println("\r" + pers1.toString() + "\r" + pers2.toString());
	}
	
	private void accionPersonaje(Personaje persA, Personaje persB) {
		persB.defender(persA.atacar());
		System.out.println(persA.getNombre() + " ataca: \t" + persB.toString());
		if (persB.getVida() <= 0) {
			System.out.println("\rEl combate ha terminado, ganó " + persA.getNombre());
			finCombate = true;
		}
	}

}