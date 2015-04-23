import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner standardInputScanner = new Scanner(System.in);
    for (;;) {
      int a = standardInputScanner.nextInt();
      int b = standardInputScanner.nextInt();
      int c = standardInputScanner.nextInt();
      
      if (a == 0 && b == 0 && c == 0) {
        break;
      }
      
      if (2 * b == a + c) {  // AP
        int result = c + (c - b);
        System.out.println("AP " + result);
      } else {  // GP
        int result = c * (c / b);
        System.out.println("GP " + result);
      }
    }
    standardInputScanner.close();
  }
}
