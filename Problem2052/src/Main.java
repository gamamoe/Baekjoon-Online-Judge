import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdInputScanner = new Scanner(System.in);
    int naturalNumber = stdInputScanner.nextInt();
    stdInputScanner.close();
    
    BigDecimal resultOfPower = new BigDecimal(0.5);
    resultOfPower = resultOfPower.pow(naturalNumber);
    System.out.println(resultOfPower.toPlainString());
  }
}
