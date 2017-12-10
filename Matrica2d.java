package Nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Matrica2d {

	public static void main(String[] args) {
	Scanner unos = new Scanner(System.in);
     System.out.print("Unesite broj redova i kolona matrice: ");
     double[][] arr = new double[unos.nextInt()][unos.nextInt()];
    
     System.out.println("Unesi matricu velicine " + arr.length + "x" + arr[0].length  + ": ");

     for (int i = 0; i < arr.length; i++) {
     for (int j = 0; j < arr[i].length; j++) {
     arr[i][j] = unos.nextDouble();
           
     }
        
     }

    System.out.println("Najveæi element niza je na poziciji: " + Arrays.toString(najveæiElement(arr)));

          }

    public static int[] najveæiElement(double[][] matrica){

    int red = 0;
    int kolona = 0;
    double maksElement = matrica[0][0];

    for (int i = 0; i < matrica.length; i++) {
    for (int j = 0; j < matrica[i].length; j++) {
    if (matrica[i][j] > maksElement){
    maksElement = matrica[i][j];
    kolona = j;
    red = i;        
        
    }
       }
        
    }
    return new int[]{kolona, red};

	}

            }
