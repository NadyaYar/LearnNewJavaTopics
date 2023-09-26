package methods;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(revers(12));

        int [] a  = {1,2,3,4,6};
        System.out.println(Arrays.toString(revers(a)));
    }

    private static int revers(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    private  static int[] revers(int[] a) {
        int[] b = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++)
            b[j] = a[i];
        return b;

    }
}
