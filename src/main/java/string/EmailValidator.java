package string;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {

        System.out.println("Please , write your email: ");
        Scanner scan = new Scanner(System.in);

        String email = scan.next();

        int i = email.indexOf("@");

        String username = email.substring(0, i);

        String domain = email.substring(i + 1);

        boolean checkIsmail = domain.startsWith("gmail");

        System.out.println("Is it email ? " + checkIsmail + System.lineSeparator() +
                "Username is " + username + System.lineSeparator() + "Domain is " + domain);

    }
}
