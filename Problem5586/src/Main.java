import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();

    int countOfJOI = 0;
    int countOfIOI = 0; 
    for (int i = 0; i <= inputString.length() - 3; ++i) {
      String currentSubString = inputString.substring(i, i + 3);

      if (currentSubString.equals("JOI")) {
        countOfJOI++;
      } else if (currentSubString.equals("IOI")) {
        countOfIOI++;
      }
    }
    
    System.out.println(countOfJOI);
    System.out.println(countOfIOI);
    scanner.close();
  }

}
