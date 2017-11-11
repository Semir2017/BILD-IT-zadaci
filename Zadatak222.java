package Zadaæa3;

import java.util.Scanner;

public class Zadatak222 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Unesite broj da bi ste vidjeli faktore: ");
        
        int broj = in.nextInt();
        for (int i = 1; i <= broj; i++) {
        if (broj % i == 0)
        System.out.print(i + " ");
        
        in.close();
            
	}
	
	}

}
