package Zada�a2;

import java.util.Scanner;

public class Zadatak44 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     System.out.print("Unesite re�enicu: ");
	     String re�enica = in.nextLine();
         System.out.println("Broj velikih iznosi: " + re�enica.replaceAll("[^A-Z]",  "").length());
	     in.close();

	}

}
