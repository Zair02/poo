import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int victorias = 0, derrotas = 0, num1, num2;
		do {
			num1 = valorRandom();
			num2 = segundoValor(num1);
			if (mayor(num1, num2)) {
				victorias++;
			} else {
				derrotas++;
			}
		} while (continuar());
		System.out.println("Resultados:\tVictorias: " + victorias + "\tDerrotas: " + derrotas);
	}
	
	public static int elegirValor() {
		System.out.println("Apostar por valor <1> o <2>");
		int ingreso;
		do {
			ingreso = consistencia();
		} while(!eleccionValida(ingreso));
		return ingreso;
	}
	
	public static boolean eleccionValida(int ingreso) {
		if (ingreso != 1 && ingreso != 2) {
			System.out.println("Error. Ingrese una opcion valida <1> o <2>");
			return false;
		} else {
			return true;
		}
	}
	
	public static int consistencia() {
		int ingreso;
		Scanner in = new Scanner(System.in);
		try {
			ingreso = in.nextInt();
		}
		catch(Exception exc) {
			System.out.println("Error. Ingrese un valor entero <1> o <2>");
			ingreso = consistencia();
		}
		return ingreso;
	} 
	
	public static int valorRandom() {
		Random ran = new Random();
		return ran.nextInt(21);
	}
	
	public static int segundoValor(int num1) {
		int num2;
		do {
			num2 = valorRandom();
		} while (num2 == num1);
		return num2;
	}
	
	public static boolean mayor(int num1, int num2) {
		int  valorElegido = elegirValor();
		System.out.println("Valor 1: " + num1 + "\tValor 2: " + num2);
		if ((num1 > num2 & valorElegido == 1) || (num1 < num2 & valorElegido == 2)) {
			System.out.println("Victoria!");
			return true;
		} else {
			System.out.println("Derrota");
			return false;
		}
	}

	public static boolean continuar() {
		Scanner in = new Scanner(System.in);
		char resp;
		boolean loop;
		do {
			System.out.println("Volver a jugar? <S> <N>");
			resp = in.next().toUpperCase().charAt(0);
			if (resp != 'S' && resp != 'N') {
				System.out.println("Error. Ingrese una respuesta valida");
				loop = true;
			} else {
				loop = false;
			}
		} while (loop);
		return resp == 'S';
	}

}
