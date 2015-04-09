#include <cstdio>
#include <iostream>
#include <string>

int main() {
  int num_of_lines = 0;

  scanf(" %d", &num_of_lines);
  while (getchar() != '\n');  // flush buffer
  std::string sentence;
  for (int i = 1; i <= num_of_lines; ++i) {
    std::getline(std::cin, sentence);
    printf("%d. %s\n", i, sentence.c_str());
  }
}
