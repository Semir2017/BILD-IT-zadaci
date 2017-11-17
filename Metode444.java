package METODE;

public class Metode444 {

	public static void main(String[] args) {
    printTwinPrimes();

    }

    public static boolean isPrimes(int n){
    int polovina = n / 2;
    boolean primes = true;
    for (int i = 2; i <= polovina; i++) {
    if (n % i == 0){
    primes = false;
    break;
            }
        }

    return primes;

    }

    public static void printTwinPrimes(){
    int perLine = 0;
    int cNumber = 1;

    while(cNumber + 2 < 10000){

    if (isPrimes(cNumber) && isPrimes(cNumber + 2)){
    
    if (perLine == 9){
    System.out.printf("%4d i %4d |\t%n", cNumber, cNumber + 2);
    perLine = 0;
                }
    else {
    System.out.printf("%4d i %4d |\t", cNumber, cNumber + 2);
    perLine++; }  }
    cNumber++;
	}

     }
         }

