package Nizovi;

public class Ormari�i {

	public static void main(String[] args) {
    
	boolean[] ormari�i = new boolean[100];
    
    for (int i = 0; i < ormari�i.length ; i++) {

    for (int j = i; j < ormari�i.length; j += (i + 1)) {
	ormari�i[j] = !ormari�i[j];
	 }

      }
    
    System.out.println("Otvoreni ormari�i: ");

	for (int i = 0; i < ormari�i.length; i++) {
    if (ormari�i[i])
   
    System.out.print((i + 1 ) + " ");	
	}

	  }
	

      }
