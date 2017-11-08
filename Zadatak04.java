package Zadaæa;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite bilo koji cijeli broj od 10 do 123456789. ");
		int broj=unos.nextInt();
		int poslednji=0;
		int cifre=broj;
	    while(cifre!=0){
		poslednji=cifre%10;
		cifre=cifre/10;
		System.out.print(poslednji);
		}
        unos.close();

	}

}
