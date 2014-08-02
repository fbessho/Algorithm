import unittest
import operator
from main import calc_group, solve


class TestMain(unittest.TestCase):
    def test_calc_group(self):
        indices_in_each_group = (
            xrange(1, 10),  # group 1
            xrange(10, 190),  # group 2
            xrange(190, 2890),  # group 3
            xrange(2890, 38890),  # group 4
        )
        answers = (1, 2, 3, 4)

        for indices, ans in zip(indices_in_each_group, answers):
            for gi, i in enumerate(indices):
                gi += 1  # `gi` is index in group (starts with one)
                self.assertEqual(calc_group(i), (ans, gi))

    def test_solve_small(self):
        output = map(int, '5678910111213141516')
        _input = xrange(1, len(output) + 1)

        for i, o in zip(_input, output):
            expected = o
            actual = solve(i)
            msg = "Failed at input #%d: expected %d, actual %d" % (
                i, expected, actual)
            self.assertEqual(expected, actual, msg=msg)

    def test_solve_big(self):
        size = 100000
        output = reduce(operator.add, map(str, range(5, size)))
        output = map(int, output)
        # output will be
        # [5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2,...]

        for i, o in enumerate(output):
            i += 1
            expected = o
            actual = solve(i)
            msg = "Failed at input #%d: expected %d, actual %d" % (
                i, expected, actual)
            self.assertEqual(expected, actual, msg=msg)


if __name__ == '__main__':
    unittest.main()
