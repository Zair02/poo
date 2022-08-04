import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese una cadena: ");
		String frase1 = in.nextLine();
		System.out.print("Ingrese otra cadena: ");
		String frase2 = in.nextLine();
		System.out.println(frase1.equals(frase2)? "Son iguales" : "Son distintas");

	}

}
