#include <cstdio>
#include <bitset>
#include <iostream>
#include <string>

const static int kNumOfAlpha = 26;

int main() {
  std::bitset<kNumOfAlpha> checking_table;
  std::string sentence;

  for (;;) {
    std::getline(std::cin, sentence);

    if (sentence == "*") {
      break;
    }

    checking_table.reset();
    for (const auto& alpha : sentence) {
      if (alpha == ' ') {
        continue;
      }

      checking_table.set(alpha - 'a', true);
    }

    if (checking_table.all()) {
      printf("Y\n");
    } else {
      printf("N\n");
    }
  }
}
