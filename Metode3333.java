package METODE;

import java.util.Scanner;

public class Metode3333 {

	public static void main(String[] args) {
    pitanje(10);}

    public static void pitanje(int brojpitanja){
    Scanner in = new Scanner(System.in);
    int netaèno = 0;
    int taèno = 0;

    for (int i = 0; i < brojpitanja; i++) {

    int firstrandom = (int)(Math.random() * 10);
    int secondrandom = (int)(Math.random() * 10);

    System.out.print("Koliko iznosi " + firstrandom + " - " + secondrandom + " ? ");
    int odgovor = in.nextInt();

    if (odgovor == firstrandom - secondrandom){
    System.out.println("Taèan odgovor !");
    taèno++;
    }
    else {
    System.out.println("Vaš odgovor je netaèan! Taèan odgovor je: " + (firstrandom - secondrandom));
    netaèno++;}
      }
    System.out.println("Taèno odgovorenih: " + taèno + "\t Netaèno odgovorenih: " + netaèno);
    
    in.close();
	
    
    }

      }
