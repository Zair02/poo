
public class CajaSuspendida implements EstadoCaja {

	private Banco banco;
	
	public CajaSuspendida(Banco banco) {
		this.banco = banco;
	}
	
	@Override
	public void atender() {
		Persona sigCliente = null;
		for (Persona cliente : banco.getClientes()) {
			if (cliente.getEdad() > 60) {
				sigCliente = cliente;
				break;
			}
		}
		
		if (sigCliente != null) {
			System.out.println("Se atenderá al cliente " + sigCliente.getNombre());
			banco.getClientes().remove(sigCliente);
		} else {
			System.out.println("No hay clientes prioritarios para atender");
		}
	}

	@Override
	public void abrir() {
		System.out.println("La caja vuelve a atender con normalidad");
		banco.cambiarEstado(new CajaAbierta(banco));
	}

	@Override
	public void cerrar() {
		System.out.println("Tras suspender su atención la caja cerrará");
		banco.cambiarEstado(new CajaCerrada(banco));
	}

	@Override
	public void suspender() {
		System.out.println("La atención en la caja ya se encuentra suspendida");
	}

}
