package Zadaæa2;

import java.util.Scanner;

public class Zadatak44 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     System.out.print("Unesite reèenicu: ");
	     String reèenica = in.nextLine();
         System.out.println("Broj velikih iznosi: " + reèenica.replaceAll("[^A-Z]",  "").length());
	     in.close();

	}

}
