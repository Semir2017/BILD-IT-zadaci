package Zadaæa2;

public class Zadatak22 {
public static void main(String[] args) {
		int palindrom = 0;
		int[] poredak = new int[1001];
		for (int i = 0; i < 1001; i++) {
		poredak[i] = i;}
		for (int i = 1; i < 1001; i++) {
		if (poredak[i] != 0) {
		for (int j = i; j < 1000 / i + 1; j++) {
		poredak[poredak[i] * j] = 0;	}}}
	    for (int i = 100; i < 1001; i++) {
		if (poredak[i] % 10 == poredak[i] / 100 && poredak[i] != 0) {
		palindrom = poredak[i];}}
		System.out.println(palindrom);
			}
        }

