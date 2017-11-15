package METODE;

import java.util.Scanner;

public class Metode4 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
        System.out.print("Unesite neki string: ");
        String string = unos.nextLine();
        System.out.print("Unesite karakter èiji broj ponavljanja želite vidjeti: ");
        char ch = unos.nextLine().trim().charAt(0);
        System.out.println("String " + string + " sadrži " + brojacKaraktera(string, ch) + " " +
        "'" + ch + "' karaktera");}
        
	    public static int brojacKaraktera(String str, char ch){
        return str.replaceAll("[^" + ch + "]", "").length();


	}

}
