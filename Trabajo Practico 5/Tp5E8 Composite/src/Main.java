
public class Main {

	public static void main(String[] args) {
		
		Carpeta carpeta1 = new Carpeta("Carpeta1");
		Carpeta carpeta2 = new Carpeta("Carpeta2");
		Carpeta carpeta3 = new Carpeta("Carpeta3");
		Carpeta carpeta4 = new Carpeta("Carpeta4");
		Carpeta carpeta5 = new Carpeta("Carpeta5");
		Archivo archivo1 = new Archivo("Archivo1");
		Archivo archivo2 = new Archivo("Archivo2");
		Archivo archivo3 = new Archivo("Archivo3");
		Archivo archivo4 = new Archivo("Archivo4");
		Archivo archivo5 = new Archivo("Archivo5");
		Archivo archivo6 = new Archivo("Archivo6");
		
		carpeta1.añadirElemento(carpeta2);
		carpeta1.añadirElemento(carpeta3);
		carpeta1.añadirElemento(archivo1);
		carpeta2.añadirElemento(carpeta4);
		carpeta2.añadirElemento(carpeta5);
		carpeta4.añadirElemento(archivo2);
		carpeta4.añadirElemento(archivo3);
		carpeta5.añadirElemento(archivo4);
		carpeta3.añadirElemento(archivo5);
		carpeta3.añadirElemento(archivo6);
		
		carpeta1.mostrarElementos();
	}
	
}
