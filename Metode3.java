package METODE;

import java.util.Scanner;

public class Metode3 {
public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
        System.out.print("Unesite reèenicu: ");
        String reèenica = unos.nextLine();

        System.out.println("Unesena reèenica sadrži " + prebrojiSlova(reèenica) + " slova.");}
        public static int prebrojiSlova(String s){
        return s.replaceAll("[^A-Za-z]", "").length();
     
      
	}

}
