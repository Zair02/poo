
public class Main {

	public static void main(String[] args) {
		Cancion cancion = new Cancion();
		
		cancion.setNombre("Un velero llamado libertad");
		cancion.setAutor("José Luis Perales");
		cancion.setDuracion(222);
		
		System.out.println(cancion.getAutor());
		System.out.println(cancion.getNombre());
		System.out.println(cancion.getDuracion());

	}

}
