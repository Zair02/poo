
public class CajaAbierta implements EstadoCaja{

	private Banco banco;
	
	public CajaAbierta(Banco banco) {
		this.banco = banco;
	}

	@Override
	public void atender() {
		System.out.println("Se atenderá al cliente: " + banco.getClientes().get(0).getNombre());
		banco.getClientes().remove(0);
	}

	@Override
	public void abrir() {
		System.out.println("La caja ya está abierta");
	}

	@Override
	public void cerrar() {
		System.out.println("La caja cerrará");
		banco.cambiarEstado(new CajaCerrada(banco));
	}

	@Override
	public void suspender() {
		System.out.println("Se suspenderá la atención de la caja");
		banco.cambiarEstado(new CajaSuspendida(banco));
	}
	
	
}
