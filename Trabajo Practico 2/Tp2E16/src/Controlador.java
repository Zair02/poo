
public class Controlador {
	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador() {
		this.inicializarVista();
	}
	
	private void inicializarVista() {
		this.vista.getBotonSaludar().addActionListener(e -> this.generarSaludo());
		this.vista.mostrar();
	}
	
	private void generarSaludo() {
		this.modelo.setNombre(this.vista.getInputNombre().getText());
		this.vista.generarSaludo(modelo.saludar());
	}
	
}
