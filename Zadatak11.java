package Zada�a2;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		char slovo;
	    int brojac = 0;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi jednu re�enicu");
		String korisnik = unos.nextLine();
		for (int i = 0; i < korisnik.length(); i++) {
		slovo = korisnik.charAt(i);
		if (Character.isUpperCase(slovo)) {
		brojac++;
					}
				}
		System.out.println("Velikih slova ima " + 100 * brojac / korisnik.length() + " %");
		unos.close();
	}

}
