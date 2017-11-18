package METODE;

public class Metode4444 {

	public static void main(String[] args) {
	GlavaPismo(100);}

    public static void GlavaPismo(int broj){
    int Glava = 0;
    int Pismo = 0;

    for (int i = 0; i < broj; i++) {
    int random = (int)(Math.random() * 2);

    if (random == 0)
    Pismo++;
    else
    Glava++;
      }
    System.out.println("Pismo: " + Pismo + " Glava: " + Glava);
	
    

	}

      }
