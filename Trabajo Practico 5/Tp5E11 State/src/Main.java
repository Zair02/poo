
public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.añadirCliente(new Persona("Zair", 20));
		banco.añadirCliente(new Persona("Diego", 35));
		banco.añadirCliente(new Persona("Martin", 62));
		banco.añadirCliente(new Persona("Marcos", 52));
		banco.añadirCliente(new Persona("Jose", 75));
		banco.añadirCliente(new Persona("Lucas", 25));
		
		banco.atenderCliente();
		banco.suspenderCaja();
		banco.atenderCliente();
		banco.cerrarCaja();
		banco.atenderCliente();
		banco.suspenderCaja();
		banco.abrirCaja();
		banco.suspenderCaja();
		banco.atenderCliente();
		banco.atenderCliente();
		banco.abrirCaja();
		banco.abrirCaja();
		banco.atenderCliente();
	}
	
}
