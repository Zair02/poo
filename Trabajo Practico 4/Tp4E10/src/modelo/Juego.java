package modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Juego {
	
	private HashMap<Color, Boolean> estadoColores = new HashMap<Color, Boolean>();
	private ArrayList<Color> colores = new ArrayList<Color>();
	private Integer nroPanel1, nroPanel2;
	
	private long tiempoDeInicio;

	public ArrayList<Color> generarColores() {
		colores.add(Color.BLUE); colores.add(Color.BLUE); estadoColores.put(Color.BLUE, false);
		colores.add(Color.RED); colores.add(Color.RED); estadoColores.put(Color.RED, false);
		colores.add(Color.GREEN); colores.add(Color.GREEN); estadoColores.put(Color.GREEN, false);
		colores.add(Color.CYAN); colores.add(Color.CYAN); estadoColores.put(Color.CYAN, false);
		colores.add(Color.YELLOW); colores.add(Color.YELLOW); estadoColores.put(Color.YELLOW, false);
		colores.add(Color.WHITE); colores.add(Color.WHITE); estadoColores.put(Color.WHITE, false);
		Collections.shuffle(colores);
		return colores;
	}
	
	public void iniciarTiempo() {
		tiempoDeInicio = System.currentTimeMillis();
	}

	public String getTiempoTranscurrido() {
		long tiempoTranscurrido = System.currentTimeMillis() - tiempoDeInicio;
		Integer minutos = (int) ((tiempoTranscurrido / 1000) / 60);
		Integer segundos = (int) (tiempoTranscurrido / 1000) % 60;
		
		return (minutos < 10? "0" + minutos : minutos) + ":" + (segundos < 10? "0" + segundos : segundos);
	}
	
	public void compararPaneles() {
		if (colores.get(nroPanel1) == colores.get(nroPanel2) && nroPanel1 != null && nroPanel2 != null) {
			estadoColores.replace(colores.get(nroPanel1), true);
		} 
	}
	
	public Boolean terminarJuego() {
		for (Boolean bool : estadoColores.values()) {
			if (!bool) {
				return false;
			}
		}
		return true;
	}
	
	public void setPanel1(Integer nroPanel1) {
		this.nroPanel1 = nroPanel1;
	}
	
	public void setPanel2(Integer nroPanel2) {
		this.nroPanel2 = nroPanel2;
	}

	public HashMap<Color, Boolean> getEstadoColores() {
		return estadoColores;
	}
	
	public ArrayList<Color> getColores(){
		return colores;
	}

	public Integer getPanel(Integer pos) {
		return (pos == 1? this.nroPanel1 : this.nroPanel2);
	}

	public boolean reiniciarPaneles() {
		if (nroPanel1 != null && nroPanel2 != null) {
		nroPanel1 = null;
		nroPanel2 = null;
		return true;
		}
		return false;
	}
	
}
