import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner standardInputScanner = new Scanner(System.in);
    int numOfTestCases = standardInputScanner.nextInt();
    
    for (int i = 1; i <= numOfTestCases; ++i) {
      System.out.println("Scenario #" + i + ":");
      int numOfWords = standardInputScanner.nextInt();
      List<String> wordList = new ArrayList<String>();
      
      for (int j = 0; j < numOfWords; ++j) {
        wordList.add(standardInputScanner.next());
      }
      
      int numOfPeople = standardInputScanner.nextInt();
      for (int j = 0; j < numOfPeople; ++j) {
        int k = standardInputScanner.nextInt();
        StringBuilder password = new StringBuilder();
        
        for (int x = 0; x < k; ++x) {
          int index = standardInputScanner.nextInt();
          password.append(wordList.get(index));
        }
        
        System.out.println(password.toString());
      }
      System.out.println();
    }
    
    standardInputScanner.close();
  }
}
