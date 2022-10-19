
public class Main {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		for(int i = 0; i < 4; i++) {
			Thread t = new HiloIncremento(contador);
			t.start();
			
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
