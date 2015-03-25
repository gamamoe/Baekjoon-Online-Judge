import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    
    int current = n;
    int lengthOfCycle = 1;
    for (;;) {
      int firstNumber = current / 10;
      int secondNumber = current % 10;
      
      current = secondNumber * 10 + (firstNumber + secondNumber) % 10;
      if (current == n) {
        break;
      }
      
      lengthOfCycle++;
    }
    System.out.println(lengthOfCycle);
  }
}
