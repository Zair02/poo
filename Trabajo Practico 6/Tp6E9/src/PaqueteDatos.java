
public class PaqueteDatos {

	private Double anguloVertical;
	private Double anguloHorizontal;
	
	public PaqueteDatos(Double anguloVertical, Double anguloHorizontal) {
		this.anguloHorizontal = anguloHorizontal;
		this.anguloVertical = anguloVertical;
	}
	
	public Double getAnguloVertical() {
		return anguloVertical;
	}
	
	public void setAnguloVertical(Double anguloVertical) {
		this.anguloVertical = anguloVertical;
	}
	
	public Double getAnguloHorizontal() {
		return anguloHorizontal;
	}
	
	public void setAnguloHorizontal(Double anguloHorizontal) {
		this.anguloHorizontal = anguloHorizontal;
	}
	
	public String toString() {
		return "PaqueteDatos [Angulo Vertical = " + anguloVertical + 
				", Angulo Horizontal = " + anguloHorizontal + "]";
	}
}

