package pcc;

/**
 * 整数{a1, a2, ..., an}が与えられた時に、その和をちょうどkにできるかどうかの判定
 */
public class Bubunwa
{
    public static void main(String[] args)
    {
        boolean ans1 = solve(new int[]{1, 2, 4, 7}, 13); // true
        System.out.println("ans1: " + ans1);

        boolean ans2 = solve(new int[]{1, 2, 4, 7}, 15); // false
        System.out.println("ans2: " + ans2);
    }

    public static boolean solve(int[] a, int k)
    {
        return dfs(a, k, 0, 0);
    }

    private static boolean dfs(int[] a, int k, int d, int sum)
    {
        if (d == a.length) return sum == k;

        if (dfs(a, k, d + 1, sum + a[d])) return true;
        if (dfs(a, k, d + 1, sum       )) return true;

        return false;
    }
}
