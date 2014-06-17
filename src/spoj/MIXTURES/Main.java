package spoj.MIXTURES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://www.spoj.com/problems/MIXTURES/
 */
public class Main
{
    private static int[] c = new int[100];              // 各色
    private static int[][] mixed_c = new int[100][100]; // mixed_c[i][j] := i番目からj番目までの色を混ぜた時の色
    private static int[][] dp = new int[100][100];      // dp[i][j] := i番目からj番目までの色を混ぜるときの最小smoke

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s;
            s = br.readLine();
            if (s == null || s.equals("")) break;

            int n = Integer.parseInt(s);

            String[] numbers = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                c[i] = Integer.parseInt(numbers[i]);
            }

            solve(n);
        }
    }

    /**
     * @param n 入力された色の数
     */
    private static void solve(int n)
    {
        for (int i = 0; i < n; i++) {
            mixed_c[i][i] = c[i];
            for (int j = i + 1; j < n; j++) {
                mixed_c[i][j] = (mixed_c[i][j - 1] + c[j]) % 100;
            }
        }

        // dpの対角成分は0で初期化されている。
        // dpの対角線よりも右上の部分を無限大で初期化する。
        for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int d = 0; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                int j = i + d;
                for (int k = i; k < j; k++) {
                    int candidate = dp[i][k] + dp[k + 1][j] + mixed_c[i][k] * mixed_c[k + 1][j];
                    dp[i][j] = Math.min(dp[i][j], candidate);
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }
}
