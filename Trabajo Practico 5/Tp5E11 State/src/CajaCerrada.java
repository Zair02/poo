
public class CajaCerrada implements EstadoCaja {
	
	private Banco banco;
	
	public CajaCerrada(Banco banco) {
		this.banco = banco;
	}

	@Override
	public void atender() {
		System.out.println("No puede atenderse cuando la caja está cerrada");
	}

	@Override
	public void abrir() {
		System.out.println("Se abre la caja");
		banco.cambiarEstado(new CajaAbierta(banco));
	}

	@Override
	public void cerrar() {
		System.out.println("La caja ya se encuentra cerrada");
	}

	@Override
	public void suspender() {
		System.out.println("No puede suspenderse mientras la caja está cerrada");
	}

}
