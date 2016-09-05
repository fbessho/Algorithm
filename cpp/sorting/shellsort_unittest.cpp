#include "shellsort.h"
#include "gmock/gmock.h"
#include "gtest/gtest.h"

TEST(ShellSort, UpToTen) {
  int input[] = {10, 8, 4, 6, 7, 1, 2, 9, 5, 3};
  sort(input, 10);

  ASSERT_THAT(input, testing::ElementsAre(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
}
