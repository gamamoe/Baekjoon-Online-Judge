public class Main {
  public static void main(String[] args) {
    String radixOf10 = "";
    String radixOf12 = "";
    String radixOf16 = "";
    
    for (int i = 2992; i < 10000; ++i) {
      radixOf10 = Integer.toString(i);
      radixOf12 = Integer.toString(i, 12);
      radixOf16 = Integer.toHexString(i);
      
      int sumOf10 = getSumOfDigit(radixOf10);
      int sumOf12 = getSumOfDigit(radixOf12);
      int sumOf16 = getSumOfDigit(radixOf16);
      
      if (sumOf10 == sumOf12 && sumOf12 == sumOf16) {
        System.out.println(i);
      }
    }
  }

  private static int getSumOfDigit(String value) {
    int sum = 0;
    
    for (int i = 0; i < value.length(); ++i) {
      if (value.charAt(i) >= 'a') {
        sum += value.charAt(i) - 87;
      } else {
        sum += value.charAt(i) - '0';
      }
    }
    
    return sum;
  }
}
