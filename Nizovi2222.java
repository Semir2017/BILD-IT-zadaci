package Nizovi;

public class Nizovi2222 {

	public static void main(String[] args) {
	boolean[] ormariæi = new boolean[100];

    for (int i = 0; i < ormariæi.length; i++) { 
    ormariæi[i] = !ormariæi[i];
        }

        for (int i = 1; i < ormariæi.length; i += 2) {
            ormariæi[i] = !ormariæi[i];
           
        }

        for (int i = 2; i < ormariæi.length; i++) {
        for (int j = i; j < ormariæi.length; j += ++j) { 
        ormariæi[j] = !ormariæi[j];
            
        }
        
         }

        System.out.print("Otvoreni ormariæi su: ");

        for (int i = 0; i < ormariæi.length; i++) {
        if (ormariæi[i])
        System.out.print((i+1) + " ");
	     }

         }
	
            }
