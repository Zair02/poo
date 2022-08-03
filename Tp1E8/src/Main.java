import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int num = in.nextInt();
		Random ran = new Random();
		int num2 = ran.nextInt(10) + 1;
		
		if (num == num2) {
			System.out.println(num + " es igual a " + num2);
			System.out.println(num + " es menor o igual a " + num2);
			System.out.println(num + " es mayor o igual a " + num2);
		} else {
			System.out.println(num + " es distinto de " + num2);
			if (num < num2) {
				System.out.println(num + " es menor a " + num2);
				System.out.println(num + " es menor o igual a " + num2);
			} else {
				System.out.println(num + " es mayor a " + num2);
				System.out.println(num + " es mayor o igual a " + num2);
			}
		}
	}

}
