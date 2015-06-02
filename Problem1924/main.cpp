#include <array>
const static int kMonth = 12;
const static int kDayOfWeek = 7;

int main() {
  int month = 0;
  int day = 0;
  std::array<int, kMonth> day_table{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  std::array<std::string, kDayOfWeek> day_of_week_table{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

  scanf(" %d %d", &month, &day);
  // SUN: 0, MON: 1, TUE: 2, WED: 3, THU: 4, FRI: 5, SAT: 6
  int day_of_week = 1;
  for (int current_month = 1; current_month <= kMonth; ++current_month) {
    int last_day_of_current_month = day_table[current_month - 1];

    for (int current_day = 1; current_day <= last_day_of_current_month; ++current_day) {
      if (current_month == month && current_day == day) {
        printf("%s\n", day_of_week_table[day_of_week].c_str());
      }

      if (day_of_week == 6) {
        day_of_week = 0;
      } else {
        day_of_week++;
      }
    }
  }
}