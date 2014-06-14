package pcc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="http://poj.org/problem?id=3617">POJ Link</a>
 * This answer doesn't pass somehow..
 */

public class BestCowLine // Change class name to Main to submit.
{
    public static final int N_MAX = 2100;
    public static char[] S = new char[N_MAX];
    public static char[] T = new char[N_MAX];

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        for (int i = 0; i < n; i++)
        {
            S[i] = cin.next().charAt(0);
        }

        // current positions point to front/end
        int f = 0, e = n-1;

        for (int i = 0; i < n; i++)
        {
            final int stringLength = e - f + 1;
            boolean left = false;
            for (int j = 0; j < stringLength; j++)
            {
                if(S[f+j] < S[e-j]) {
                    left = true; break;
                }
                if(S[f+j] > S[e-j]) {
                    left = false; break;
                }
            }

            if(left) {
                T[i] = S[f]; f++;
            }
            else {
                T[i] = S[e]; e--;
            }
        }

        T[n] = '\0';

        for (int i = 0; i < (n-1)/80+1; i++)
        {
            System.out.println(Arrays.copyOfRange(T, i*80, i*80+80));
        }
    }
}
