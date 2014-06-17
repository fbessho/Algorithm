package poj.LakeCounting;

/**
 * Lake counting (<a href="http://poj.org/problem?id=2386">POJ Link</a>).
 */
public class Main
{
    // 庭のサイズ: M x N
    private static final int M = 10;
    private static final int N = 12;

    private static boolean[] field = new boolean[]{
            true, false, false, false, false, false, false, false, false, true, true, false,
            false, true, true, true, false, false, false, false, false, true, true, true,
            false, false, false, false, true, true, false, false, false, true, true, false,
            false, false, false, false, false, false, false, false, false, true, true, false,
            false, false, false, false, false, false, false, false, false, true, false, false,
            false, false, true, false, false, false, false, false, false, true, false, false,
            false, true, false, true, false, false, false, false, false, true, true, false,
            true, false, true, false, true, false, false, false, false, false, true, false,
            false, true, false, true, false, false, false, false, false, false, true, false,
            false, false, true, false, false, false, false, false, false, false, true, false
    };

    public static void main(String[] args)
    {
        int count = 0;
        for (int x = 0; x < N; x++)
        {
            for (int y = 0; y < M; y++)
            {
                if (field[N * y + x])
                {
                    count++;
                    dfs(x, y);
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(int x, int y)
    {
        int i = N * y + x;
        field[i] = false;

        for (int dx = -1; dx <= 1; dx++)
        {
            for (int dy = -1; dy <= 1; dy++)
            {
                int x_new = x + dx;
                int y_new = y + dy;
                int i_new = N * y_new + x_new;

                if (x_new >=0 && x_new < N && y_new >= 0 && y_new < M && field[i_new])
                {
                    dfs(x_new, y_new);
                }
            }
        }
    }
}
