package METODE;

import java.util.Scanner;

public class Metode5555 {

	public static void main(String[] args) {
		
    Scanner unos = new Scanner(System.in);
    System.out.print("Unesite du�inu stranice kvadrata: ");
    double stranica = unos.nextDouble();

    System.out.println("Povr�ina kvadrata iznosi: " + Povr�ina(stranica) + ", a obim iznosi: " + Obim(stranica));}

    public static double Obim(double stranica){
    return stranica * 4; }

    public static double Povr�ina(double stranica){
	return stranica * stranica;

	}

         }
