import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {
	private int[] resultados = {0, 0, 0, 0, 0, 0};
	private int[] numerosJugados = {0, 0, 0, 0, 0, 0};
	private int aciertos = 0;
	
	public void reiniciarLoteria() {
		for(int i = 0; i < resultados.length; i++) {
			resultados[i] = 0;
		}
		for(int i = 0; i < numerosJugados.length; i++) {
			numerosJugados[i] = 0;
		}
		aciertos = 0;
	}
	
	public void ingresarNumeros() {
		System.out.println("Ingrese 6 valores: ");
		for (int i = 0; i < numerosJugados.length; i++) {
			try {
				System.out.println("Valor " + (i+1) + ": ");
				numerosJugados[i] = consRango(numerosJugados[i]);
				numerosJugados[i] = consRepetido(numerosJugados[i], i, numerosJugados);
				System.out.println(Arrays.toString(numerosJugados));
			} catch (Exception exc) {
				System.out.println("Error en el tipo de dato");
				i--;
			}
		}
		Arrays.sort(numerosJugados);
	}
	
	public int consRango(int numero) {
		Scanner in = new Scanner(System.in);
		numero = in.nextInt();
		while (numero < 1 || numero > 50) {
			System.out.println("Error, valor fuera de rango");
			System.out.print("Ingrese un nuevo valor: ");
			numero = in.nextInt();
		}
		return numero;
	}
	
	public int consRepetido(int numero, int max, int[] valores) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < max-1; i++) {
			if (valores[i] == numero) {
				System.out.println("Error, valor repetido");
				System.out.print("Ingrese un nuevo valor: ");
				numero = in.nextInt();
			}
		}
		return numero;
	}
	
	public void generarResultado() {
		Random ran = new Random();
		for (int i = 0; i < resultados.length; i++) {
			resultados[i] = ran.nextInt(50) + 1;
			for (int j = 0; j < i-1; j++) {
				if (resultados[i] == resultados[j]) {
					resultados[i] = ran.nextInt(50) + 1;
				}
			}
		}
		Arrays.sort(resultados);
	}
	
	public void coincidencias() {
		for (int i = 0; i < resultados.length; i++) {
			if (Arrays.binarySearch(numerosJugados, resultados[i]) >= 0) {
				aciertos++;
			}
		}
	}
	
	public void resultadoFinal() {
		System.out.println("Numeros ingresados: " + Arrays.toString(numerosJugados));
		System.out.println("Resultados de la loteria: " + Arrays.toString(resultados));
		System.out.println("Aciertos: " + aciertos);
		if (aciertos == 6) {
			System.out.println("Ganaste!");
		}
	}
	
	public boolean continuar() {
		Scanner in = new Scanner(System.in);
		char resp;
		System.out.println("Volver a jugar? <S/N>");
		resp = in.next().toUpperCase().charAt(0);
		while (resp != 'S' && resp != 'N') {
			System.out.println("Error. Ingrese una respuesta valida <S/N>");
			resp = in.next().toUpperCase().charAt(0);
		}
		return resp == 'S';
	}
	
}
