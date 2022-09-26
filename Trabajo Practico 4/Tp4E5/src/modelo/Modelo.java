package modelo;

public class Modelo {
	
	private String operador1;
	private String operador2;
	private Character operacion;
	
	public void setOperacion(String op1, String op2, Character operacion) {
		operador1 = op1;
		operador2 = op2;
		this.operacion = operacion;
	}
	
	public String getOperacion() {
		return Double.valueOf(operador1) + " " + operacion + " " + Double.valueOf(operador2);
	}

	public Double getResultadoOperacion() throws ExcepcionDivCero, NumberFormatException{
		switch(operacion) {
		case '+':
			return Double.valueOf(operador1) + Double.valueOf(operador2);
		case '-':
			return Double.valueOf(operador1) - Double.valueOf(operador2);
		case '*':
			return Double.valueOf(operador1) * Double.valueOf(operador2);
		case '/':
			if (Double.valueOf(operador2) == 0) {
				throw new ExcepcionDivCero();
			}
			return Double.valueOf(operador1) / Double.valueOf(operador2);
		}
		return 0.0;
	}
	
	
}
