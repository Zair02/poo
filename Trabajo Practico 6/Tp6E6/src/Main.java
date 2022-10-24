
public class Main {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		Hilo1 hilo1 = new Hilo1();
		Hilo2 hilo2 = new Hilo2();
		hilo1.start();
		hilo2.start();
	}

	private static class Hilo1 extends Thread {
	
		public void run() {
			
			synchronized(Lock1) {
				System.out.println("Hilo 1: Reteniendo a Lock1...");
				try { 
					Thread.sleep(10); 
				} catch (InterruptedException e) {
				}
				System.out.println("Hilo 1: Esperando a Lock2...");
				synchronized (Lock2) {
					System.out.println("Hilo 1: Reteniendo a Lock1 y Lock2");
				}
			}
		}
	}

	private static class Hilo2 extends Thread {
	
		public void run() {
			try {
				sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			synchronized (Lock2) {
				System.out.println("Hilo 2: Reteniendo a Lock2...");
				try { 
					Thread.sleep(10); 
				} catch (InterruptedException e) {}
				System.out.println("Hilo 2: Esperando por Lock1...");
				synchronized(Lock1) {
					System.out.println("Hilo 2: Reteniendo a Lock1 y Lock2");
				}
			}
		}
	}
}