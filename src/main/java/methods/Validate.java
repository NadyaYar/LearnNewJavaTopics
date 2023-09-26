package methods;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println(validate(name));

        System.out.println("Please, enter your age: ");
        int age = scanner.nextInt();
        System.out.println(validate(age));
    }

    private static boolean validate(String name) {
        return name.matches("[a-zA-Z]+");
    }

    private static boolean validate(int age) {
        return age >= 18;
    }
}
