package METODE;

import java.util.Scanner;

public class Metode3333 {

	public static void main(String[] args) {
    pitanje(10);}

    public static void pitanje(int brojpitanja){
    Scanner in = new Scanner(System.in);
    int neta�no = 0;
    int ta�no = 0;

    for (int i = 0; i < brojpitanja; i++) {

    int firstrandom = (int)(Math.random() * 10);
    int secondrandom = (int)(Math.random() * 10);

    System.out.print("Koliko iznosi " + firstrandom + " - " + secondrandom + " ? ");
    int odgovor = in.nextInt();

    if (odgovor == firstrandom - secondrandom){
    System.out.println("Ta�an odgovor !");
    ta�no++;
    }
    else {
    System.out.println("Va� odgovor je neta�an! Ta�an odgovor je: " + (firstrandom - secondrandom));
    neta�no++;}
      }
    System.out.println("Ta�no odgovorenih: " + ta�no + "\t Neta�no odgovorenih: " + neta�no);
    
    in.close();
	
    
    }

      }
