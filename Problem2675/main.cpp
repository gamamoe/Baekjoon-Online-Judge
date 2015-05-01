#include <cstdio>
#include <iostream>
#include <string>
int main() {
  int num_of_test_cases = 0;

  scanf(" %d", &num_of_test_cases);
  for (int i = 0; i < num_of_test_cases; ++i) {
    int num_of_repeat = 0;
    std::string string_sequence;

    std::cin >> num_of_repeat >> string_sequence;
    for (const auto& c : string_sequence) {
      for (int j = 0; j < num_of_repeat; ++j) {
        printf("%c", c);
      }
    }
    printf("\n");
  }
}
