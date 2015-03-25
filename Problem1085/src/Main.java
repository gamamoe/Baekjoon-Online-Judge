import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int widthOfRectangle = scanner.nextInt();
    int heightOfRectangle = scanner.nextInt();
    scanner.close();
    
    List<Integer> lengthList = new ArrayList<Integer>();
    lengthList.add(x);
    lengthList.add(y);
    lengthList.add(widthOfRectangle - x);
    lengthList.add(heightOfRectangle - y);

    System.out.println(Collections.min(lengthList));
  }
}
