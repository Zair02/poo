
public class Main {

	public static void main(String[] args) {
		
		Servidor servidor = new Servidor();
		new IngenieroCivil(servidor, "IngCivil").start();
		new IngEnObra(servidor, "IngObra1").start();
		new IngEnObra(servidor, "IngObra2").start();
		
	}
	
}
