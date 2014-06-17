package pcc;

import org.junit.Test;

public class KnapsackTest
{
    @Test
    public void testKnapsack() throws Exception
    {
        Knapsack knapsack = new Knapsack(
                new int[]{2, 1, 3, 2},
                new int[]{3, 2, 4, 2},
                5);
        System.out.println(knapsack.solve());

    }
}
