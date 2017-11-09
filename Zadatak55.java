package Zadaæa2;

import java.util.Scanner;

public class Zadatak55 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.println("Unesi password (Najmanje 8 slova, minimalno 2 broja): ");
	        String password = in.next();
            System.out.println(password.matches("(?=.*?\\d.*?\\d)([\\w]{8,})") ? "Password je validan.":"Password nije validan.");
            in.close();
	    }
}


