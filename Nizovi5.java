package Nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Nizovi5 {

	public static void main(String[] args) {
    Scanner unos = new Scanner(System.in);
    int[] niz = new int[5];

    for (int i = 0; i < 5; i++) {
    System.out.print("Unesite vrijednost za indeks " + i + " niza: ");
    niz[i] = unos.nextInt();
       
    }

    System.out.println("Najveæi zajednièki djelilac za sve elemente niza je: " + NZD(niz));

    }

    public static int NZD(int... brojevi){

    Arrays.sort(brojevi);
    int NZD = 1;

    out:

    for (int i = brojevi[brojevi.length - 1]; i > 0; i--) {

    for (int j = 0; j < brojevi.length; j++) {

    if (brojevi[j] % i != 0)
    continue out;

     }
     
    NZD = i;
    break;
      
    }
   
    return NZD;

	}

      
     }
