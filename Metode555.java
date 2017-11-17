package METODE;

public class Metode555 {

	public static void main(String[] args) {
    printpalindromePrimes();}
    
	public static boolean ispalindrome(int n){
    return n == (Integer.parseInt(new StringBuilder(n + "").reverse().toString()));
	}
    public static boolean isPrimes(int n){
    int half = n / 2;
    
    boolean primes = true;
    
    for (int i = 2; i <= half; i++) {
    
    if (n % i == 0){
    primes = false;
    break;
            }
        }

    return primes;}

    public static void printpalindromePrimes(){
    int cNumber = 1;
    int numbersFound = 1;
    
    while (numbersFound <= 100){

    if (isPrimes(cNumber) && ispalindrome(cNumber)){
    if (numbersFound % 10 == 0){
    
    System.out.println(cNumber + " ");
    numbersFound++;
                }
    else {
    System.out.print(cNumber + " ");
    numbersFound++;
                }
            }
    cNumber++;

	}

     }  
          }
