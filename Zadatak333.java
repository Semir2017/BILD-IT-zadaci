package Zadaæa3;

import java.util.Scanner;

public class Zadatak333 {
public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
	        System.out.print("Unesite neki string da bi ste ga vidjeli naopako:");
            System.out.println("String naopako: " + new StringBuilder(in.nextLine()).reverse());
	        in.close();

	}

}
