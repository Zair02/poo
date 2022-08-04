public class Main {

	public static void main(String[] args) {
		String[] cadenas = llenar();
		for (String string : cadenas) {
			System.out.println(string);
		}
	}

	public static String[] llenar() {
		String[] cadenas = new String[5];
		for (int i = 0; i < cadenas.length; i++) {
			cadenas[i] = "cadena" + i;
		}
		return cadenas;
	}
}
