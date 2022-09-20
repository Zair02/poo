package modelo;

import java.io.File;

public class Modelo {
	
	private String texto;
	private File file;

	public String generarMsj() {
		return "Usted ingreso: " + texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	

}
