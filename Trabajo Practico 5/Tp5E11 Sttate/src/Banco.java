import java.util.ArrayList;

public class Banco {

	private EstadoCaja caja;
	private ArrayList<Persona> filaClientes = new ArrayList<Persona>();
	
	public Banco() {
		caja = new CajaAbierta(this);
	}
	
	public void atenderCliente() {
		caja.atender();
	}

	public void suspenderCaja() {
		caja.suspender();
	}

	public void cerrarCaja() {
		caja.cerrar();
	}

	public void abrirCaja() {
		caja.abrir();
	}
	
	public void cambiarEstado(EstadoCaja estado) {
		this.caja = estado;
	}
	
	public void añadirCliente(Persona persona) {
		filaClientes.add(persona);
	}

	public ArrayList<Persona> getClientes() {
		return filaClientes;
	}

}
