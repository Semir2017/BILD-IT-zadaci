package Nizovi;

import java.util.Scanner;

public class Zadatak333 {

	public static void main(String[] args) {
    Scanner unos = new Scanner(System.in);
	
    double[][] first = new double[3][3];
	double[][] second = new double[3][3];

    System.out.println("Unesite brojeve za prvu 3x3 matricu: ");

	for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
    first[i][j] = unos.nextDouble();
	            }
	        }

	System.out.println("Unesite brojeve za drugu 3x3 matricu: ");

    for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
    second[i][j] = unos.nextDouble();
      }
	   
       }

	System.out.println("Proizvod matrica je: ");

    double[][] proizvod = pomnozitiMatrice(first, second);
    for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
	System.out.printf("%.2f ", proizvod[i][j]);
	          
	}
	System.out.println();
	        }

	    }

    public static double[][] pomnozitiMatrice(double[][] first, double[][] second){
    double[][] proizvod = new double[3][3];
	double zbir;

    for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
    zbir = 0;
	
    for (int k = 0; k < 3; k++) {
    zbir += (first[i][k] * second[k][j]);
	                
    }
     
    proizvod[i][j] = zbir;
	           
	}
	        
    }
	return proizvod;
	
    
    }

        }
