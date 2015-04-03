#include <cstdio>

const int kMax = 500;

int main() {
  int n = 0;

  scanf(" %d", &n);
  int num_of_proper_set = 0;
  for (int b = 1; b <= kMax; ++b) {
    for (int a = 1; a <= kMax; ++a) {
      if (a * a == b * b + n) {
        num_of_proper_set++;
      }
    }
  }
  printf("%d\n", num_of_proper_set);
}
