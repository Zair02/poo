
public class Main {

	public static void main(String[] args) {
		
		ProductoConcreto pc = new ProductoConcreto(200.0);
		ARSDecorator ad = new ARSDecorator(pc);
		USDDecorator ud = new USDDecorator(new ProductoConcreto(510.5));
		
		System.out.println(pc.getPrecio());
		System.out.println(ad.getPrecio());
		System.out.println(ud.getPrecio());
	}

}
