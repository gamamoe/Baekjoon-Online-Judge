import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    BigInteger bigInt = new BigInteger(inputString, 2);

    System.out.println(bigInt.toString(8));
    scanner.close();
  }
}
