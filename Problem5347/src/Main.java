import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfTestCases = scanner.nextInt();
    
    for (int i = 0; i < numOfTestCases; ++i) {
      long a = scanner.nextLong();
      long b = scanner.nextLong();
      
      long lcm = calcLcm(a, b);
      System.out.println(lcm);
    }
    
    scanner.close();
  }

  private static long calcLcm(long a, long b) {
    return a * b / calcGcd(a, b);
  }

  private static long calcGcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    
    return calcGcd(b, a % b);
  }

}
