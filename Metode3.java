package METODE;

import java.util.Scanner;

public class Metode3 {
public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
        System.out.print("Unesite re�enicu: ");
        String re�enica = unos.nextLine();

        System.out.println("Unesena re�enica sadr�i " + prebrojiSlova(re�enica) + " slova.");}
        public static int prebrojiSlova(String s){
        return s.replaceAll("[^A-Za-z]", "").length();
     
      
	}

}
