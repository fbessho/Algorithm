import com.google.common.base.Stopwatch;

/**
 * GuavaのStapwatchのデモ
 * http://qiita.com/fbessho/items/d542acb2db93e9635d1d
 */
public class StopwatchDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        Stopwatch sw = Stopwatch.createUnstarted();

        long[] millis = {0, 0, 0, 1, 10, 100, 1000, 10000};
        int[] nanos   = {10, 100, 1000, 0, 0, 0, 0, 0};

        for (int i = 0; i < nanos.length; i++) {
            System.out.print(String.format("%5dms %4dns -> ", millis[i], nanos[i]));
            sw.start();
            Thread.sleep(millis[i], nanos[i]);
            System.out.println(sw.stop());
            sw.reset();
        }
    }
}
