import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner standardInputScanner = new Scanner(System.in);
    BigInteger a = standardInputScanner.nextBigInteger();
    BigInteger b = standardInputScanner.nextBigInteger();
    standardInputScanner.close();
    System.out.println(a.add(b));
  }
}
