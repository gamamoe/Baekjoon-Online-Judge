import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    for (;;) {
      int radixNum = scanner.nextInt();
      
      if (radixNum == 0) {
        break;
      }
      
      String stringNumber = scanner.next();
      String modulo = scanner.next();
      BigInteger inputNumber = new BigInteger(stringNumber, radixNum);
      BigInteger problemModulo = new BigInteger(modulo, radixNum);
      String result = inputNumber.mod(problemModulo).toString(radixNum);
      System.out.println(result);
    }
    
    scanner.close();
  }
}
