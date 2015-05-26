#include <cmath>
#include <cstdio>

int main() {
  int num_of_test_cases = 0;

  scanf(" %d", &num_of_test_cases);
  for (int i = 0; i < num_of_test_cases; ++i) {
    int total_score = 0;
    int score = 0;

    scanf(" %d", &score);
    total_score += 9.23076 * pow(26.7 - score, 1.835);
    scanf(" %d", &score);
    total_score += 1.84523 * pow(score - 75, 1.348);
    scanf(" %d", &score);
    total_score += 56.0211 * pow(score - 1.5, 1.05);
    scanf(" %d", &score);
    total_score += 4.99087 * pow(42.5 - score, 1.81);
    scanf(" %d", &score);
    total_score += 0.188807 * pow(score - 210, 1.41);
    scanf(" %d", &score);
    total_score += 15.9803 * pow(score - 3.8, 1.04);
    scanf(" %d", &score);
    total_score += 0.11193 * pow(254 - score, 1.88);

    printf("%d\n", total_score);
  }
}
