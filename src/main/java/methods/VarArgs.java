package methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Max value is : " + max(1, 2, 3, 45, 1, 88, 5, 2));
        System.out.println("Sum of values is : " + sum(1, 2, 55, 65, 34));
    }

    private static int max(int... a) {
        if (a.length == 0) {
            return Integer.MIN_VALUE;
        }
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }

    private static int sum(int... num) {
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

}

