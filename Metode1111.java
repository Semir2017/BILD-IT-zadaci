package METODE;

public class Metode1111 {

	public static void main(String[] args) {
	System.out.println(format(34,40));}

    public static String format(int broj, int width){
    return String.format("%0" + width + "d", broj);

	}

   }
