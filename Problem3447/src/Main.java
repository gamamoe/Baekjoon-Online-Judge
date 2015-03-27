import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (scanner.hasNextLine()) {
      String sentence = scanner.nextLine();
      String replacedSentence = sentence.replace("BUG", "");
      
      for (;;) {
        if (sentence.equals(replacedSentence)) {
          System.out.println(replacedSentence);
          break;
        }
        
        sentence = replacedSentence;
        replacedSentence = replacedSentence.replace("BUG", "");
      }
    }
    
    scanner.close();
  }
}