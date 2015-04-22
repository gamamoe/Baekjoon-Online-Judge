#include <algorithm>
#include <iostream>
#include <cstdio>
#include <string>

int main() {
  std::string integer1;
  std::string integer2;

  std::cin >> integer1 >> integer2;
  int length_of_integer1 = integer1.size();
  int length_of_integer2 = integer2.size();

  if (length_of_integer1 > length_of_integer2) {
    std::string padding(length_of_integer1 - length_of_integer2, '0');
    integer2 = padding + integer2;
  } else if (length_of_integer1 < length_of_integer2) {
    std::string padding(length_of_integer2 - length_of_integer1, '0');
    integer1 = padding + integer1;
  }

  int length = std::max(length_of_integer1, length_of_integer2);
  for (int i = 0; i < length; ++i) {
    printf("%d", integer1[i] - '0' + integer2[i] - '0');
  }
}
