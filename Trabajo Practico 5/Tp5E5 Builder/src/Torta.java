
public class Torta {

	private String masa;
	private String relleno;
	
	public void setMasa(String masa) {
		this.masa = masa;
	}
	
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	
	public String toString() {
		return "Torta de " + masa + " y relleno de " + relleno;
	}

}
