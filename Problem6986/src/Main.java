import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfScores = scanner.nextInt();
    int numOfDeletionScores = scanner.nextInt();
    List<Double> scoreList = new ArrayList<Double>();
    
    for (int i = 0; i < numOfScores; ++i) {
      double score = scanner.nextDouble();
      scoreList.add(score);
    }

    Collections.sort(scoreList);
    double frontSubtitution = scoreList.get(numOfDeletionScores);
    double backSubtitution = scoreList.get(scoreList.size() - 1 - numOfDeletionScores);
    
    double firstAverage = 0.0;
    double secondAvearge = 0.0;
    for (int i = numOfDeletionScores; i < scoreList.size() - numOfDeletionScores; ++i) {
      firstAverage += scoreList.get(i);
    }
    secondAvearge = firstAverage + numOfDeletionScores * (frontSubtitution + backSubtitution);
    
    System.out.printf("%.2f\n", firstAverage / (scoreList.size() - 2 * numOfDeletionScores));
    System.out.printf("%.2f\n", secondAvearge / scoreList.size());
    
    scanner.close();
  }
}
