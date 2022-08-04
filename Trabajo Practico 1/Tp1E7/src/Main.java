import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String frase1 = in.nextLine();
		System.out.print("Ingrese otra frase: ");
		String frase2 = in.nextLine();
		System.out.println("Resultado: " + frase1 + " " + frase2);
	}

}
