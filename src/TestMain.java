import java.util.Arrays;

/**
 * Created by nat on 14/01/22.
 */
public class TestMain
{
    public static void main(String[] args)
    {
        int[] i = new int[]{1, 2, 3};
        testArray(i);

        System.out.println(Arrays.toString(i));
    }

    public static void testArray(int[] input)
    {
        int tmp;
        tmp = input[0];
        input[0] = input[1];
        input[1] = tmp;
    }
}
