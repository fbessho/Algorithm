import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nat on 14/01/23.
 */
public class MergeSortTest
{
    @Test
    public void testQuickSort() throws Exception
    {
        int[] input = Arrays.copyOf(SortTestUtil.Q1, SortTestUtil.Q1.length);
        int[] output = MergeSort.mergeSort(input);
        Assert.assertArrayEquals(SortTestUtil.A1, output);
    }

    @Test
    public void testQuickSort2() throws Exception
    {
        int[] input = Arrays.copyOf(SortTestUtil.Q2, SortTestUtil.Q2.length);
        int[] output = MergeSort.mergeSort(input);
        System.out.println(Arrays.toString(output));
        Assert.assertArrayEquals(SortTestUtil.A2, output);
    }
}
