/**
 * Created by nat on 14/01/23.
 */
public class MergeSort
{
    public static int[] mergeSort(int[] input, int left, int right)
    {
        if((right-left)>0)
        {
            int middle = left + (right-left)/2;
            int[] div1 = mergeSort(input, left, middle);
            int[] div2 = mergeSort(input, middle+1, right);
            int[] output = new int[right-left+1];
            int i=0, i1=0, i2=0;
            while(i1<div1.length && i2<div2.length)
            {
                if(div1[i1] < div2[i2])
                {
                    output[i++] = div1[i1++];
                }
                else
                {
                    output[i++] = div2[i2++];
                }
            }
            for(int j=i1; j<div1.length; j++)
            {
                output[i++] = div1[j];
            }
            for(int j=i2; j<div2.length; j++)
            {
                output[i++] = div2[j];
            }
            return output;
        }
        else
        {
            return new int[]{input[left]};
        }
    }

    public static int[] mergeSort(int[] input)
    {
        return mergeSort(input, 0, input.length-1);
    }
}
