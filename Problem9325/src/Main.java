import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfTestCases = scanner.nextInt();
    
    for (int i = 0; i < numOfTestCases; ++i) {
      int priceOfCar = scanner.nextInt();
      int numOfDifferentOptions = scanner.nextInt();
      int totalPrice = priceOfCar;
      
      for (int j = 0; j < numOfDifferentOptions; ++j) {
        int numOfOptions = scanner.nextInt();
        int priceOfOption = scanner.nextInt();
        
        totalPrice += numOfOptions * priceOfOption;
      }
      System.out.println(totalPrice);
    }
    
    scanner.close();
  }
}