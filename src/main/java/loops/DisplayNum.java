package loops;

import java.util.Scanner;

public class DisplayNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Print your number: ");
        int number = scan.nextInt();

        int r;
        String str = "";

        while (number > 0) {
            r = number % 10;
            number = number / 10;
            str = str + r;
        }
        char word;
        for (int i = str.length() - 1; i >= 0; i--) {
            word = str.charAt(i);

            switch (word) {
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                default:
                    System.out.println("Incorrect value");
            }
        }
    }

}
