package Zadaæa3;

import java.util.Scanner;

public class Zadatak555 {

	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
	        System.out.print("Unesite neki string:");
	        String string = in.nextLine().toLowerCase();
           
	        for (int i = 0; i < string.length(); i++) {
	        boolean ismultiChar = true;
	        
	        for (int j = 0; j < string.length(); j++) {

	        if (i == j)
	        continue;

	        if (string.charAt(i) == string.charAt(j)) {
	        ismultiChar = false;
	        break; }
            
	        if (ismultiChar) {
	        System.out.println(string.charAt(i));
	        break;
	               
	           }

	        }

	    }

	   }
           
}
