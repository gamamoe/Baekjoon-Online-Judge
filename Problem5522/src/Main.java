import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final int NUM_OF_GAMES = 5;
    Scanner scanner = new Scanner(System.in);
    
    int totalScore = 0;
    for (int i = 0; i < NUM_OF_GAMES; ++i) {
      int currentScore = scanner.nextInt();
      totalScore += currentScore;
    }
    System.out.println(totalScore);
    scanner.close();
  }
}
