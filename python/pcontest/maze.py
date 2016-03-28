"""The fastest path in a maze (p37)"""

maze = '''\
#S######.#
......#..#
.#.##.##.#
.#........
##.##.####
....#....#
.#######.#
....#.....
.####.###.
....#...G#'''
maze = maze.split('\n')

s = (1, 0)
g = (8, 9)

INF = None
d = [[INF]*10 for i in range(10)]
dx_list = [0, 1, 0, -1]
dy_list = [-1, 0, 1, 0]

def display(d):
    print ''
    print '-' * 20
    for y in range(10):
        tmp = ''
        for x in range(10):
            if maze[y][x] != '.':
                tmp += maze[y][x]
            elif d[y][x] is None:
                tmp += 'X'
            else:
                tmp += str(d[y][x]%10)
        print tmp

queue = [s]
s_x, s_y = s
d[s_y][s_x] = 0
loop_cnt = 0

while queue:
    loop_cnt += 1
    if (loop_cnt % 10) == 0:
        display(d)
    x, y = queue.pop(0)
    if (x, y) == g:
        break
    for dx, dy in zip(dx_list, dy_list):
        x_new, y_new = x+dx, y+dy
        if (0 <= x_new < 10) and (0 <= y_new < 10) and maze[y_new][x_new]!='#' and d[y_new][x_new]==None:
            d[y_new][x_new] = d[y][x] + 1
            queue.insert(0, (x_new, y_new))

g_x, g_y = g
print 'Ans: %d' % d[g_y][g_x]
    
    
