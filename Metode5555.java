package METODE;

import java.util.Scanner;

public class Metode5555 {

	public static void main(String[] args) {
		
    Scanner unos = new Scanner(System.in);
    System.out.print("Unesite dužinu stranice kvadrata: ");
    double stranica = unos.nextDouble();

    System.out.println("Površina kvadrata iznosi: " + Površina(stranica) + ", a obim iznosi: " + Obim(stranica));}

    public static double Obim(double stranica){
    return stranica * 4; }

    public static double Površina(double stranica){
	return stranica * stranica;

	}

         }
