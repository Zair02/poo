
public class Main {

	public static void main(String[] args) {
		
		Servidor servidor = new Servidor();
		
		Thread t1 = new Boya("CIDMAR-1", servidor);
		t1.start();
		
		Thread t2 = new Boya("CIDMAR-2", servidor);
		t2.start();
		
		Thread t3 = new Cientifico(servidor);
		t3.start();
		
	}
	
}
