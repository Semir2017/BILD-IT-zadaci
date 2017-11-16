package METODE;

public class Metode55 {

	public static void main(String[] args) {
    System.out.println(pretvoriMilisekunde(100000));

    }

    public static String pretvoriMilisekunde(long milisec){
    long sec = milisec / 1000;
    long trenutnoSekundi = sec % 60;
    long trenutnoMinuta = (sec / 60) % 60;
    long trenutnoSati = (sec / 60 / 60) % 24;

    return trenutnoSati + ":" + trenutnoMinuta + ":" + trenutnoSekundi;


	}

}
