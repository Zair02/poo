import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		int num1 = in.nextInt();
		System.out.print("Ingrese  segundo numero entero: ");
		int num2 = in.nextInt();
		System.out.println("Suma de los valores ingresados: " + (num1 + num2));
	}

}
