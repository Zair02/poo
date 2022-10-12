
public class Main {

	public static void main(String[] args) {
		
		TortaVainillaBuilder builder1 = new TortaVainillaBuilder();
		TortaCocoBuilder builder2 = new TortaCocoBuilder();
		Director director = new Director();
		
		director.hacerTorta(builder1);
		Torta torta1 = builder1.getTorta(); 
		System.out.println(torta1.toString());
		
		director.hacerTorta(builder2);
		Torta torta2 = builder2.getTorta(); 
		System.out.println(torta2.toString());
	}
	
}
