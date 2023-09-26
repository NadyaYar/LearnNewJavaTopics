package loops;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Programme print AP series");
        System.out.println("Please enter the numbers a, b, n");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();

        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.println(term);
            term = term * b;
        }
    }
}
