
public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i <6; i++) {
			Thread t1 = new HiloMundo();
			t1.setName("Hilo-" + i);
			t1.start();
		}
		
	}
	
}
