package Nizovi;

import java.util.Scanner;

public class Nizovi222 {

	    public static void main(String[] args) {
		
	    Scanner unos = new Scanner(System.in);
        double[][] first = new double[3][3];
        double[][] second = new double[3][3];
        
        System.out.println("Unesite prvu 3x3 matricu: ");

        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        first[i][j] = unos.nextDouble();
            }
        }

        System.out.println("Unesite drugu 3x3 matricu: ");

        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        second[i][j] = unos.nextDouble();
           
        }
        }

        double[][] zbir = saberiteMatrice(first, second);

        System.out.println("Zbir matrica je: ");

        for (int i = 0; i < first.length; i++)  {
        for (int j = 0; j < first[0].length; j++)  {
        
        System.out.print(zbir[i][j] + " ");
           
        }
        
        System.out.println();
        
        
        }
          }

        public static double[][] saberiteMatrice(double[][] a, double[][] b) {

        double[][] zbir = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
        zbir[i][j] = a[i][j] + b[i][j];
            }
        
        }
        
        return zbir;
	      }

         }
