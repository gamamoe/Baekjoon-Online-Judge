#include <cstdio>
#include <iostream>
#include <string>

int main() {

  for (;;) {
    std::string input_number;

    std::cin >> input_number;
    if (input_number == "0") {
      break;
    }

    std::string current_number(input_number);
    for (;;) {
      int total_sum = 0;

      for (const auto& digit : current_number) {
        total_sum += digit - '0';
      }

      if (total_sum < 10) {
        printf("%d\n", total_sum);
        break;
      } else {
        char temp[100];
        sprintf(temp, "%d", total_sum);
        current_number = temp;
      }
    }
  }
}
