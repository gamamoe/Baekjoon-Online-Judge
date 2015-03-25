#include <algorithm>
#include <cstdio>
#include <iostream>
#include <vector>

const int kMaxNumOfSubject = 1000;

int main() {
  int num_of_subject = 0;

  scanf(" %d", &num_of_subject);

  std::vector<int> score_vector;
  score_vector.reserve(kMaxNumOfSubject);
  for (int i = 0; i < num_of_subject; ++i) {
    int scoreOfSubject = 0;
    scanf(" %d", &scoreOfSubject);
    score_vector.push_back(scoreOfSubject);
  }

  int max_score = *std::max_element(score_vector.begin(), score_vector.end());
  double score_of_average = 0.0;
  for (const auto& score : score_vector) {
    if (score == max_score) {
      score_of_average += 100.0;
    } else {
      score_of_average += (static_cast<double>(score) / max_score) * 100;
    }
  }

  printf("%.2f", score_of_average / num_of_subject);
}
