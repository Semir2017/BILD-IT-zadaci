package METODE;

import java.util.Arrays;
import java.util.Scanner;

public class Metode111 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Unesite tri broja za sortiranje: ");

        double prviBroj = in.nextDouble();
        double drugiBroj = in.nextDouble();
        double treciBroj = in.nextDouble();

        ispisatiSortiraneBrojeve(prviBroj, drugiBroj,treciBroj);}

        public static void ispisatiSortiraneBrojeve(double broj1, double broj2, double broj3){
        System.out.print("Brojevi koji su u rastuæem redoslijedu: ");
        Arrays.stream(new double[]{broj1, broj2, broj3})
        .sorted()
        .forEach(broj -> System.out.print(broj + " "));

        }

       }
