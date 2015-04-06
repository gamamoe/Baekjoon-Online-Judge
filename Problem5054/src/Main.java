import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner standardInputReader = new Scanner(System.in);
    int numOfTestCases = standardInputReader.nextInt();
    
    for (int i = 0; i < numOfTestCases; ++i) {
      List<Integer> infoOfParking = new ArrayList<Integer>();
      int numOfParking = standardInputReader.nextInt();
      
      for (int j = 0; j < numOfParking; ++j) {
        int parkingNum = standardInputReader.nextInt();
        infoOfParking.add(parkingNum);
      }
      Collections.sort(infoOfParking);
      int lastIndex = infoOfParking.size() - 1;
      System.out.println(2 * (infoOfParking.get(lastIndex) - infoOfParking.get(0)));
    }
    
    standardInputReader.close();
  }
}
