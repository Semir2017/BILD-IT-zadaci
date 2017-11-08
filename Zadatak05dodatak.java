package Zadaæa;

import java.util.Scanner;

public class Zadatak05dodatak {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Koliko æemo uradit spratova?");
		int sprat=unos.nextInt();
		for ( int i=1; i<=sprat; i++){
		for ( int j=1; j<=i;j++){
		System.out.print(j+" ");}
		System.out.println();
			}
		
		System.out.println();
		for (int i=sprat; i>=1; i--){
		for ( int j=1; j<=i; j++){
		System.out.print(j+ " ");}
		System.out.println();
			}
		System.out.println();
		for (int i=1; i<=sprat; i++){
		for (int j=0; j<=sprat-1-i; j++){
		System.out.print("  ");}
			
		for (int k=1; k<=i; k++){
		System.out.print(k+" ");}
	    System.out.println();
			}
		System.out.println();
		for (int i=sprat; i>=1; i--){
		for (int j=sprat;j>i;j--){
		
		System.out.print("  ");}
		for (int k=1; k<=i; k++){
		System.out.print(k+" ");}
	    System.out.println();}
		unos.close();

	}

}
