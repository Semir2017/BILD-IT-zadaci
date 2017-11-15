package METODE;

public class Metode2 {

	public static void main(String[] args) {
		 System.out.println("Prosti brojevi od 0 do 100.000 su: ");
         for (int i = 0; i <= 100000; i++) {
	     if (isProstiBroj(i))
	     System.out.println(i + " ");
	        }
           }
         public static boolean isProstiBroj(int n){
         int sred = n / 2;
	     boolean isProstiBroj = true;

	     for (int i = 2; i <= sred; i++) {
	     if (n % i == 0) {
	     isProstiBroj = false;
	     break;
	            }
	        }
         return isProstiBroj;


	    }

         }
