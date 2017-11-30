package Nizovi;

public class Nizovi444 {

	public static void main(String[] args) {
	
	int[][] matrica = new int[4][4];

    for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
    int random = (int)(Math.random() * 2);
    matrica[i][j] = random;
            }
        }

    int brojMaksJedinicaReda = 0;
    int brojMaksJedinicaKolone = 0;
    int brojJedinicaTrenutnogReda = 0;
    int brojJedinicaTrenutneKolone = 0;
    int redMaksJedinica = 0;
    int kolonaMaksJedinica = 0;


    for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {

    if (matrica[i][j] == 1)
    brojJedinicaTrenutnogReda++;
    if (matrica[j][i] == 1)
    brojJedinicaTrenutneKolone++;
            
    }
    
    if (brojJedinicaTrenutnogReda > brojMaksJedinicaReda) {
    brojMaksJedinicaReda = brojJedinicaTrenutnogReda;
    redMaksJedinica = i;
         
    }
            
    if (brojJedinicaTrenutneKolone > brojMaksJedinicaKolone){
    brojMaksJedinicaKolone = brojJedinicaTrenutneKolone;
    kolonaMaksJedinica = i;
     
    }
           
    brojJedinicaTrenutnogReda = 0;
    brojJedinicaTrenutneKolone = 0;
       
    }

    System.out.println("Red sa najvise jedinica je: " + redMaksJedinica + "\nkolona sa najvise jedinica je: " + kolonaMaksJedinica);

	             
	}

         
     }
