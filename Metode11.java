package METODE;

public class Metode11 {

	public static void main(String[] args) {
		  int poLiniji = 0;
          for (int i = 0; i < 100; i++) {
	      int random = (int) (Math.random() * 10);
	      
	      if (poLiniji == 9) {
	      System.out.println(random + " ");
	      poLiniji = 0;
	            
	      } else {
	      System.out.print(random + " ");
	      poLiniji++;
	            }
	        }

	         }
          public static void printRandomUppercase() {
          int poLiniji = 0;
          for (int i = 0; i < 100; i++) {
	      char random = (char) ((Math.random() * (('Z' + 1) - 'A')) + 'A');
	      
	      if (poLiniji == 9) {
	      System.out.println(random + " ");
	      poLiniji = 0;
	      
	      } else {
	      System.out.print(random + " ");
	      poLiniji++;
	            }

	}
	}

}
