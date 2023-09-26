package thread.synchronation.atm;

public class Demo {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Customer c = new Customer(atm, "Alex", 12);
        Customer c1 = new Customer(atm, "Olha", 40);

        c.start();
        c1.start();
    }
}
