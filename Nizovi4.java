package Nizovi;

import java.util.Arrays;

public class Nizovi4 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fibonnaciNiz()));

    }

    public static long[] fibonnaciNiz(){

    long prvi = 0;
    long drugi = 1;
    long[] fiboNiz = new long[100];
    fiboNiz[0] = prvi;
    fiboNiz[1] = drugi;
    int index = 2;
    long FibonaciFound = 2;

    while (FibonaciFound < 100){
    long fiboNovi = prvi + drugi;
    prvi = drugi;
    drugi = fiboNovi;

    fiboNiz[index] = fiboNovi;
    index++;
    FibonaciFound++;
        
    }

    return fiboNiz;
	}

      }
