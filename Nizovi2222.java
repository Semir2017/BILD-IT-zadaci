package Nizovi;

public class Nizovi2222 {

	public static void main(String[] args) {
	boolean[] ormari�i = new boolean[100];

    for (int i = 0; i < ormari�i.length; i++) { 
    ormari�i[i] = !ormari�i[i];
        }

        for (int i = 1; i < ormari�i.length; i += 2) {
            ormari�i[i] = !ormari�i[i];
           
        }

        for (int i = 2; i < ormari�i.length; i++) {
        for (int j = i; j < ormari�i.length; j += ++j) { 
        ormari�i[j] = !ormari�i[j];
            
        }
        
         }

        System.out.print("Otvoreni ormari�i su: ");

        for (int i = 0; i < ormari�i.length; i++) {
        if (ormari�i[i])
        System.out.print((i+1) + " ");
	     }

         }
	
            }
