import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numeros = new int[6];
		int[] resultados = new int[6];
		do {
			numeros = reiniciar(numeros);
			resultados = reiniciar(resultados);
			
			numeros = ingresoNum(numeros);
			resultados = generarResultados(resultados);
			
			Arrays.sort(numeros);
			Arrays.sort(resultados);
			System.out.println("Numeros ingresados: " + Arrays.toString(numeros));
			System.out.println("Resultados de la loteria: " + Arrays.toString(resultados));
			
			int aciertos = coincidencias(numeros, resultados);
			System.out.println("Aciertos: " + aciertos);
			if (aciertos == 6) {
				System.out.println("Ganaste!");
			}
		} while(continuar());
	}

	public static int[] reiniciar(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		return array;
	}
	
	public static int[] ingresoNum(int[] numeros) {
		System.out.println("Ingrese 6 valores: ");
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println("Valor " + (i+1) + ": ");
				numeros[i] = consRango(numeros[i]);
				numeros[i] = consRepetido(numeros[i], i, numeros);
				System.out.println(Arrays.toString(numeros));
			} catch (Exception exc) {
				System.out.println("Error en el tipo de dato");
				i--;
			}
		}
		return numeros;
	}
	
	public static int consRango(int numero) {
		Scanner in = new Scanner(System.in);
		numero = in.nextInt();
		while (numero < 1 || numero > 50) {
			System.out.println("Error, valor fuera de rango");
			System.out.print("Ingrese un nuevo valor: ");
			numero = in.nextInt();
		}
		return numero;
	}
	
	public static int consRepetido(int numero, int max, int[] valores) {
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
	
	public static int[] generarResultados(int[] resultados) {
		Random ran = new Random();
		for (int i = 0; i < resultados.length; i++) {
			resultados[i] = ran.nextInt(50) + 1;
			for (int j = 0; j < i-1; j++) {
				if (resultados[i] == resultados[j]) {
					resultados[i] = ran.nextInt(50) + 1;
				}
			}
		}
		return resultados;
	}
	
	public static int coincidencias(int[] array1, int[] array2) {
		int aciertos = 0;
		for (int i = 0; i < array1.length; i++) {
			if (Arrays.binarySearch(array1, array2[i]) >= 0) {
				aciertos++;
			}
		}
		return aciertos;
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
