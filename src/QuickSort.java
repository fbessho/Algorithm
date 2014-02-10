import java.util.Arrays;
import java.util.List;

/**
 * Created by nat on 14/01/22.
 */
public class QuickSort
{
    public static void quickSort(int[] input, int left, int right)
    {
        System.out.println(String.format("%s, %d, %d", Arrays.toString(input), left, right));
        if (left < right)
        {
            int pivot = getPivot(input[left], input[right], input[left + (right - left) / 2]);
            int l = left;
            int r = right;
            while (true)
            {
                while (input[l] < pivot) l++;
                while (input[r] > pivot) r--;
                if (r <= l)
                {
                    if (l == left)
                    {
                        quickSort(input, left, l);
                        quickSort(input, l+1, right);
                    }
                    else
                    {
                        quickSort(input, left, l - 1);
                        quickSort(input, l, right);
                    }
                    break;
                }
                else
                {
                    int tmp;
                    tmp = input[l];
                    input[l] = input[r];
                    input[r] = tmp;
                    l++; r--;
                }
            }
        }
    }

    public static void quickSort(int[] input)
    {
        quickSort(input, 0, input.length - 1);
    }

    public static int getPivot(int a, int b, int c)
    {
        if (a < b) return b > c ? (a < c ? c : a) : b;
        else return b > c ? b : (a > c ? c : a);
    }
}
