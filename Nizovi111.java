package Nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Nizovi111 {

	    public static void main(String[] args) {
		
	    Scanner unos = new Scanner(System.in);
        System.out.print("Unesite deset decimalnih brojeva: ");
        double[] brojevi = new double[10];

        for (int i = 0; i < brojevi.length; i++) {
        brojevi[i] = unos.nextDouble();
        
        }

        BubbleSort(brojevi);
        System.out.println("Sortirani array je: " + Arrays.toString(brojevi));
          }


        public static void BubbleSort(double[] arr){

        double temp;
        boolean sortirani = false;

        while (!sortirani) {

        sortirani = true;

        for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
       
       
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        sortirani = false;
               
            }
          }  
        }
         }
            }
	
        
