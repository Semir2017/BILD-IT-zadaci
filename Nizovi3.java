package Nizovi;

import java.util.ArrayList;
import java.util.Arrays;

public class Nizovi3 {

	public static void main(String[] args) {
    System.out.println(Arrays.toString(uklonitiDuplikate(new int[]{1,1,2,5,4,3,3,8,7,6,5,5})));

    }

    public static int[] uklonitiDuplikate(int[] niz){

    ArrayList<Integer> nemaDuplikata = new ArrayList<>();
    Arrays.stream(niz).distinct().forEach(nemaDuplikata::add);
    int[] nizNovi = new int[nemaDuplikata.size()];

    for (int i = 0; i < nemaDuplikata.size(); i++) {
    nizNovi[i] = nemaDuplikata.get(i);
        
    }

    return nizNovi;

	}

    }
