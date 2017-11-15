package METODE;

import java.util.Arrays;
import java.util.Scanner;

public class Metode1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Unesite tri broja potrebna za sortiranje: ");

        double brojJedan = in.nextDouble();
        double brojDva = in.nextDouble();
        double brojTri = in.nextDouble();
        ispisiSortiraneBrojeve(brojJedan,brojDva,brojTri);}

    public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3){

        System.out.print("Brojevi koji su rastucem redoslijedu: ");
        Arrays.stream(new double[]{broj1, broj2, broj3})
        .sorted()
        .forEach(broj -> System.out.print(broj + " "));
       
      }

       }
