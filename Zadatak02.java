package Zadaæa;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite jedan niz cijelih brojeva,pozitivnih i negativnih uzimajuæi u obzir da 0 prekida unos.");
		double broj=unos.nextDouble();
        double brojacp=0;
		double brojacn=0;
		double zbir=0;
		double prosjek=0;
		while(broj!=0){
		zbir=zbir+broj;
		if (broj>0){
				brojacp++;}
		if (broj<0){
				brojacn++;}
		prosjek=zbir/(brojacp+brojacn);
		broj=unos.nextDouble();
			}
        System.out.println("Unijeli ste " + brojacp + " pozitivnih brojeva, a "+brojacn+" negativnih brojeva.");
		System.out.println(" Zbir ovih brojeva je " + zbir + ", dok je njihov prosjek je "+prosjek);
		unos.close();
		}
		}

	


