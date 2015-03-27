#include <cstdio>
#include <iostream>
#include <map>
#include <string>

int main() {
  std::map<std::string, int> working_bee_map;
  working_bee_map["Re"] = 0;
  working_bee_map["Pt"] = 0;
  working_bee_map["Cc"] = 0;
  working_bee_map["Ea"] = 0;
  working_bee_map["Tb"] = 0;
  working_bee_map["Cm"] = 0;
  working_bee_map["Ex"] = 0;

  std::string working_name;
  int num_of_total_work = 0;
  while (std::cin >> working_name) {
    working_bee_map[working_name]++;
    num_of_total_work++;
  }
  printf("Re %d %1.2lf\n", working_bee_map["Re"],
         (double) working_bee_map["Re"] / num_of_total_work);
  printf("Pt %d %1.2lf\n", working_bee_map["Pt"],
         (double) working_bee_map["Pt"] / num_of_total_work);
  printf("Cc %d %1.2lf\n", working_bee_map["Cc"],
         (double) working_bee_map["Cc"] / num_of_total_work);
  printf("Ea %d %1.2lf\n", working_bee_map["Ea"],
         (double) working_bee_map["Ea"] / num_of_total_work);
  printf("Tb %d %1.2lf\n", working_bee_map["Tb"],
         (double) working_bee_map["Tb"] / num_of_total_work);
  printf("Cm %d %1.2lf\n", working_bee_map["Cm"],
         (double) working_bee_map["Cm"] / num_of_total_work);
  printf("Ex %d %1.2lf\n", working_bee_map["Ex"],
         (double) working_bee_map["Ex"] / num_of_total_work);
  printf("Total %d 1.00", num_of_total_work);

}
