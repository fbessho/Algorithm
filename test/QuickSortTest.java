import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nat on 14/01/23.
 */
public class QuickSortTest
{
    @Test
    public void testQuickSort() throws Exception
    {
        int[] input = Arrays.copyOf(SortTestUtil.Q1, SortTestUtil.Q1.length);
        QuickSort.quickSort(input);
        Assert.assertArrayEquals(SortTestUtil.A1, input);
    }

    @Test
    public void testQuickSort2() throws Exception
    {
        int[] input = Arrays.copyOf(SortTestUtil.Q2, SortTestUtil.Q2.length);
        QuickSort.quickSort(input);
        System.out.println(Arrays.toString(input));
        Assert.assertArrayEquals(SortTestUtil.A2, input);
    }
}
