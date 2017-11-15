package METODE;

import java.util.Scanner;

public class Metode5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Unesite broj stopa: ");
        double stope = in.nextDouble();
        System.out.println(stope + " stopa iznosi " + stopeUmetre(stope) + " metara");
         }
        public static double stopeUmetre(double stope){
        return stope * 0.305;

	     }

       }
