
package arrays;
import java.util.Arrays;
public class phuc4 {
    public static void main(String[] args) {
        int[] iq = {126, 167, 95 };
        increase(iq);
        System.out.println(Arrays.toString(iq));
    }
     public static int [] increase (int[] a) {
        for (int i=0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
    return a;
    }
}
