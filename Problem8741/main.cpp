#include <cstdio>
#include <string>

int main() {
  int k = 0;
  scanf(" %d", &k);
  std::string front(k, '1');
  std::string back(k - 1, '0');
  printf("%s%s", front.c_str(), back.c_str());
}
