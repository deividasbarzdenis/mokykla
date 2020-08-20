package lt.codeacademy.studies.javabasica.secondweek.operators;

import java.util.Scanner;

public class Uzduotis1 {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String sakinys = ivesti();
		int indeksas1 = 0;
		int indeksas2 = sakinys.length(); // pakeisti

		String z1 = sakinys.substring(indeksas1, indeksas2);

		System.out.println("Pirmas sakinio žodis: " + z1 + ".");
	}

	private static String ivesti() {
		System.out.println("Iveskite sakini is keliu zodziu: ");
		String sakinis = sc.nextLine();
		// TODO Auto-generated method stub
		return sakinis;
	}

}
