package pcc;

/**
 * knapsack problem
 * 重さと価値がそれぞれwi, viであるようなn個の品物から、重さの総和がWを超えないように荷物を選んだ時の価値の最大
 */
public class Knapsack
{
    private final int[] w;
    private final int[] v;
    private final int W;

    public Knapsack(int[] w, int[] v, int W)
    {
        this.w = w;
        this.v = v;
        this.W = W;
    }

    public int solve()
    {
        return rec(0, W);
    }

    // i番目以降の荷物から重さの総和がj以下になるように選ぶ
    public int rec(int i, int j)
    {
        if(i==w.length) return 0;
        if(w[i] > j) return rec(i+1, j);
        else
        {
            return Math.max(
                    rec(i+1, j), v[i] + rec(i+1, j-w[i])
            );
        }
    }
}
