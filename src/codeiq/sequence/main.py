# coding=utf-8
"""
CodeIQコード銀行　コードお預かり窓口さんの問題
「コード銀行：n番目の数字は？」
"""


def seq_y(i):
    g, j = calc_group(i)  # `y[i]` is the `j`th number in the group `g`
    return seq_x(g, (g * 10 ** (g - 1)) + (j - 1))


def calc_group(i):
    """
    Returns group id of y_i, and index in the group.
    """
    current_group = 1
    end_of_current_group = 0
    end_of_previous_group = 0
    while True:
        n = current_group
        end_of_previous_group = end_of_current_group
        end_of_current_group += 9 * (10 ** (n - 1)) * n
        if i <= end_of_current_group:
            break
        current_group += 1

    return current_group, (i - end_of_previous_group)


def seq_x(n, i):
    return int(str(int(i / n))[i % n])


def solve(i):
    return seq_y(i + 4)


if __name__ == '__main__':
    for line in open('testdata.in.txt'):
        print solve(int(line))

    print solve(10 ** 30)
    #
    # for x in range(1, 100):
    # print "%3d: %d" % (x, solve(x))
