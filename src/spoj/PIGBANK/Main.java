package spoj.PIGBANK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://www.spoj.com/problems/PIGBANK/
 */
public class Main
{
    private static int dp[][] = new int[600][11000];
    private static int[] p = new int[1000];
    private static int[] w = new int[1000];

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++)
        {
            String[] weightLine = br.readLine().split(" ");
            int E = Integer.parseInt(weightLine[0]);
            int F = Integer.parseInt(weightLine[1]);
            int W = F - E; // weight of coins
            int N = Integer.parseInt(br.readLine()); // コインの種類数
            for (int n = 0; n < N; n++)
            {
                String[] numbers = br.readLine().split(" ");
                p[n] = Integer.parseInt(numbers[0]);
                w[n] = Integer.parseInt(numbers[1]);
            }

            solve(p, w, W, N);
        }
    }

    /**
     *
     * @param p 各硬貨の価値
     * @param w 各硬貨の重さ
     * @param W 硬貨の重さの合計
     * @param N 硬貨の種類数
     */
    private static void solve(int[] p, int[] w, int W, int N)
    {
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < W + 1; j++)
            {
                if((j-w[i])>=0 && dp[i+1][j-w[i]]!=Integer.MAX_VALUE) dp[i+1][j] = Math.min(dp[i][j], dp[i+1][j-w[i]] + p[i]);
                else dp[i+1][j] = dp[i][j];
            }
        }

        int minValue = dp[N][W];
        if( minValue == Integer.MAX_VALUE )
            System.out.println("This is impossible.");
        else
            System.out.println("The minimum amount of money in the piggy-bank is " + minValue + ".");
    }

}
