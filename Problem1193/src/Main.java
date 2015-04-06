import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner standardInputScanner = new Scanner(System.in);
    int findingNum = standardInputScanner.nextInt();

    int numOfStartGroup = 1;
    int startNumber = 0;
    for (int i = 1;; ++i) {
      numOfStartGroup += i;
      
      if (numOfStartGroup > findingNum) {
        startNumber = numOfStartGroup - i;
        numOfStartGroup = i;
        break;
      }
    }

    int initialNumerator = 1;
    int initialDenominator = 1;
    if (numOfStartGroup % 2 == 0) {  // 짝수군
      initialNumerator = 1 + (findingNum - startNumber);
      initialDenominator = numOfStartGroup - (findingNum - startNumber);
    } else {  // 홀수군
      initialNumerator = numOfStartGroup - (findingNum - startNumber);
      initialDenominator = 1 + (findingNum - startNumber);
    }
    
    System.out.println(initialNumerator + "/" + initialDenominator);
    standardInputScanner.close();
  }
}
