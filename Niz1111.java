package Nizovi;

import java.util.Scanner;

public class Niz1111 {

	public static void main(String[] args) {
		 Scanner unos = new Scanner(System.in);
	     System.out.print("Unesite dužinu niza: ");
	     int length = unos.nextInt();
	     int[] arr = new int [length];

	    System.out.print("Unesite niz: ");
	    for (int i = 0; i < length; i++) {
	    arr[i] = unos.nextInt();
	       
	    }

	    System.out.println(isSorted(arr) ? "Ovaj niz je sortiran." : "Ovaj niz nije sortiran.");

	    }

	    public static boolean isSorted(int[] niz){
        for (int i = 0; i < niz.length - 1; i++) {
	    if (niz[i] > niz[i + 1])
	    
	    return false;
	       
        }
	   
        return true;

	    }

         }
