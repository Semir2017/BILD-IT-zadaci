package Zada�a;

public class Zadatak03 {

	public static void main(String[] args) {
		System.out.println("Brojevi od 1 do 1000 djeljivi sa 4 ali ne i sa 5.");
		int brojac=0;
		for(int i=1; i<=1000; i++){
		if (i%4==0 && i%5!=0){
		brojac++;
		if (brojac%10==0){
	    System.out.println(i);}
				
        else {
		System.out.print(i+ " ");
				}
		}
			
		}
		}
	
}


