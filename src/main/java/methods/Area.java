package methods;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = scanner.nextDouble();
        double c = scanner.nextDouble();
        double radius = scanner.nextDouble();

        System.out.println(area(l, c));
        System.out.println(area(radius));
    }

    private static double area(double l, double a) {
        return l * a;
    }

    private static double area(double radius) {
        return 3.14 * radius * radius;
    }
}
