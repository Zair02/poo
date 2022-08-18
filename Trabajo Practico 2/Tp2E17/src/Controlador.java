
public class Controlador {
	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.inicializarVista();
	}
	
	private void inicializarVista() {
		this.vista.getBoton1().addActionListener(e -> modelo.cambiarEstadoBoton(vista.getBoton1(), vista.getBoton2()));
		this.vista.getBoton2().addActionListener(e -> modelo.cambiarEstadoBoton(vista.getBoton2(), vista.getBoton3()));
		this.vista.getBoton3().addActionListener(e -> modelo.cambiarEstadoBoton(vista.getBoton3(), vista.getBoton1()));
		this.vista.mostrar();
	}

}
