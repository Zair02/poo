import javax.swing.JButton;

public class Modelo {
	
	public void cambiarEstadoBoton(JButton boton1, JButton boton2) {
		boton1.setEnabled(false);
		boton2.setEnabled(true);
	}
}
