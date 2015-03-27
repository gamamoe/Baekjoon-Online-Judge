import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    for (int i = 0; i < n; ++i) {
      long testValue = scanner.nextLong();
      BigInteger nextPrimeNumber = new BigInteger(String.valueOf(testValue));
      
      if (nextPrimeNumber.isProbablePrime(1)) {
        System.out.println(nextPrimeNumber);
      } else {
        System.out.println(nextPrimeNumber.nextProbablePrime());
      }
      
    }
    scanner.close();
  }
  
}
