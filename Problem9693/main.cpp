#include <cstdio>
#include <cmath>

int main() {
  int n = 0;

  for (int j = 1;; ++j) {
    scanf(" %d", &n);

    if (n == 0) {
      break;
    }

    int trailing_sifar = 0;
    for (int i = 1;; ++i) {
      int current = pow(5.0, i);

      if (current > n) {
        break;
      }

      trailing_sifar += n / current;
    }
    printf("Case #%d: %d\n", j, trailing_sifar);
  }
}