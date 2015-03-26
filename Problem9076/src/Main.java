import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfTestCases = scanner.nextInt();
    final int NUM_JUDGE = 5;
    
    for (int i = 0; i < numOfTestCases; ++i) {
      List<Integer> scoreList = new ArrayList<Integer>();
      for (int j = 0; j < NUM_JUDGE; ++j) {
        int score = scanner.nextInt();
        scoreList.add(score);
      }
      
      Collections.sort(scoreList);
      scoreList.remove(0);
      scoreList.remove(scoreList.size() - 1);
      int minScore = Collections.min(scoreList);
      int maxScore = Collections.max(scoreList);
      
      if (maxScore - minScore >= 4) {
        System.out.println("KIN");
      } else {
        int finalScore = 0;
        for (Integer score : scoreList) {
          finalScore += score;
        }
        System.out.println(finalScore);
      }
    }
    
    scanner.close();
  }
}
