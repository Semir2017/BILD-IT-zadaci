package Zadaæa;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Program izraèunava koliko æeš novca uštedit ukoliko je godišnja kamata 5%.");
        System.out.println(" Koliko bi para uložio?");
		double novac=unos.nextInt();
		System.out.println("Na koliko mjeseci bi podigao?");
		double mjeseci=unos.nextInt();
		double kamata=0.05/12;
		double zbir=0;
		for ( int i=1; i<=mjeseci; i++){
		zbir=(zbir+novac)*(1+kamata);
		}
		System.out.printf(" Za "+ mjeseci + " mjeseci bi uštedio %.2f KM.",zbir);
		unos.close();
}
}
