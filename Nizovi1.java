package Nizovi;

public class Nizovi1 {

	public static void main(String[] args) {
		for (int i : neparni(new int[]{1,2,3,4,5,6,7})){
            System.out.println(i);
        }
         
	}

    public static int[] neparni(int[] Niz){

    int Novinizduzina = Niz.length % 2 == 0 ? Niz.length / 2 : Niz.length / 2 + 1;
    int[] noviNiz = new int[Novinizduzina];
    for (int i = 0, j = 0; i < Niz.length; i += 2, j++) {
    noviNiz[j] = Niz[i];
        
    }
   
    return noviNiz;


	}

}
