#include <string>
#include <iostream>
int main() {
  std::string input_string;

  while (std::getline(std::cin, input_string)) {
    std::cout << input_string << '\n';
  }
}