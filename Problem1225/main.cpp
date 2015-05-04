#include <cstdio>
#include <iostream>
#include <string>
#include <map>

int main() {
  std::map<int, int> digit_map1;
  std::map<int, int> digit_map2;
  std::string operand1;
  std::string operand2;

  std::cin >> operand1 >> operand2;
  int length_of_operand1 = operand1.size();
  int length_of_operand2 = operand2.size();

  for (int i = 0; i < length_of_operand1; ++i) {
    digit_map1[operand1[i] - '0']++;
  }
  for (int i = 0; i < length_of_operand2; ++i) {
    digit_map2[operand2[i] - '0']++;
  }

  long long result = 0;
  for (const auto& digit1 : digit_map1) {
    for (const auto& digit2: digit_map2) {
      result += digit1.first * digit1.second * digit2.first * digit2.second;
    }
  }

  std::cout << result;
}
