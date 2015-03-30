import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfInput = scanner.nextInt();
    
    int numOfPrime = 0;
    for (int i = 0; i < numOfInput; ++i) {
      BigInteger input = scanner.nextBigInteger();
      
      if (input.isProbablePrime(10)) {
        numOfPrime++;
      }
    }
    
    System.out.println(numOfPrime);
    scanner.close();
  }

}
