#include <cstdio>
#include <iostream>
#include <map>
#include <string>

int main() {
  std::map<char, bool> alpha_table;
  for (char i = 'A'; i <= 'Z'; ++i) {
    alpha_table[i] = false;
  }

  int num_of_test_cases = 0;
  scanf(" %d", &num_of_test_cases);
  for (int i = 0; i < num_of_test_cases; ++i) {
    std::map<char, bool> temp_table(alpha_table);

    std::string input_string;
    std::cin >> input_string;

    for (const auto& alpha : input_string) {
      temp_table[alpha] = true;
    }

    int sum_of_ascii = 0;
    for (const auto& table_info : temp_table) {
      if (!table_info.second) {
        sum_of_ascii += table_info.first;
      }
    }

    printf("%d\n", sum_of_ascii);
  }
}
