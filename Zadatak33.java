package Zadaæa2;

import java.util.Scanner;

public class Zadatak33 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	      System.out.print("Unesite cijenu: ");
	        int cijena = in.nextInt();
	        int brojNovcica = cijena / 5; 
	        cijena %= 5;                  

	        brojNovcica += cijena / 3; 
	        cijena %= 3;               

	        brojNovcica += cijena;    
	        System.out.println("Broj novèiæa koji je potreban za placanje je: " + brojNovcica);
	        in.close();

	    }
	}

