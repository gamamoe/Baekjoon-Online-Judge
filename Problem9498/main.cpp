#include <cstdio>

int main() {
  int score_of_test = 0;

  scanf(" %d", &score_of_test);
  if (90 <= score_of_test && score_of_test <= 100) {
    printf("A");
  } else if (80 <= score_of_test && score_of_test <= 89) {
    printf("B");
  } else if (70 <= score_of_test && score_of_test <= 79) {
    printf("C");
  } else if (60 <= score_of_test && score_of_test <= 69) {
    printf("D");
  } else {
    printf("F");
  }
}
