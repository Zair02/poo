import java.util.ArrayList;

public class IngenieroCivil extends Thread{

	private String nombre;
	private Servidor servidor;
	private ArrayList<PaqueteDatos> colaPaquete = new ArrayList<PaqueteDatos>();
	
	public IngenieroCivil(Servidor servidor, String nombre) {
		this.servidor = servidor;
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		Integer cont = 0;
		while (cont < 2) {
			PaqueteDatos pd = servidor.obtenerDato();
			if (pd == null) {
				cont++;
			} else {
				colaPaquete.add(pd);
			}
		}
		this.informe();
	}
	
	public void informe() {
		Integer cont = 0;
		for (PaqueteDatos pd : colaPaquete) {
			if (pd.getAnguloVertical() < 30) {
				cont++;
			}
		}
		System.out.println("De los " + colaPaquete.size() + " medidos, " 
							+ cont + " son aptos para construir");
	}
	
	public Servidor getServidor() {
		return servidor;
	}
	
	public void serServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	
	public ArrayList<PaqueteDatos> getColaPaquete(){
		return colaPaquete;
	}
	
	public void setColaPaquete(ArrayList<PaqueteDatos> colaPaquete) {
		this.colaPaquete = colaPaquete;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
