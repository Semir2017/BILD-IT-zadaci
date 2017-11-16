package METODE;

public class Metode22 {

	public static void main(String[] args) {
    System.out.println(saberiteBrojeve(234));  }
     public static int saberiteBrojeve(long n) {
        int zbir = 0;
        while (n > 0) {
        zbir += n % 10;
        n /= 10;
        }
        return zbir;


	}

}
