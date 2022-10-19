
public class HiloMundo extends Thread{
	
	private Integer id;
	
	public HiloMundo() {
		String[] split = this.getName().split("-");
		this.id = Integer.valueOf(split[1]);
	}

	@Override
	public void run() {
		try {
			sleep(1000 * id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": Hola mundo!");
		
	}

	
	
}
