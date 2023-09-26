package loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

    }
}
