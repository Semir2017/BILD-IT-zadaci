package Nizovi;

public class Nizovi2 {

	public static void main(String[] args) {
	for (int i : Kombinacija(new int[]{1,2,3}, new int[]{10,11,12})){
    System.out.print(i + " ");
      }

    }

    public static int[] Kombinacija(int[] prviNiz, int[] drugiNiz){
        
    int[] Kombinovani = new int[prviNiz.length + prviNiz.length];

    for (int i = 0, j = 0; i < Kombinovani.length; i+=2, j++) {

    Kombinovani[i] = prviNiz[j];
    Kombinovani[i+1] = drugiNiz[j];
            
        }

    return Kombinovani;
	
    }

   }
