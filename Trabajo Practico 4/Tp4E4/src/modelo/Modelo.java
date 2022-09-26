package modelo;

import idiomas.*;

public class Modelo {
	
	private Idioma idioma;
	private String mensaje;

	public void setIdioma(IdiomasPermitidos inputIdioma) {
		switch (inputIdioma) {
		case INGLES:
			idioma = new Ingles();
			break;
		case PORTUGUES:
			idioma = new Portugues();
			break;
		case FRANCES:
			idioma = new Frances();
			break;
		}
	}
	
	public void setMensaje(Integer nroMensaje) {
		switch(nroMensaje){
		case 0:
			mensaje = idioma.saludar();
			break;
		case 1:
			mensaje = idioma.despedirse();
			break;
		case 2: 
			mensaje = idioma.perdon();
			break;
		case 3:
			mensaje = idioma.pedirCafe();
			break;
		case 4:
			mensaje = idioma.cuantoCuesta();
			break;
		case 5:
			mensaje = idioma.dondeQueda();
			break;
		default:
			mensaje = "";
		}
	}
	
	public String getTraduccion() {
		return mensaje;
	}
}
