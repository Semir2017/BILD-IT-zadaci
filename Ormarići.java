package Nizovi;

public class Ormariæi {

	public static void main(String[] args) {
    
	boolean[] ormariæi = new boolean[100];
    
    for (int i = 0; i < ormariæi.length ; i++) {

    for (int j = i; j < ormariæi.length; j += (i + 1)) {
	ormariæi[j] = !ormariæi[j];
	 }

      }
    
    System.out.println("Otvoreni ormariæi: ");

	for (int i = 0; i < ormariæi.length; i++) {
    if (ormariæi[i])
   
    System.out.print((i + 1 ) + " ");	
	}

	  }
	

      }
