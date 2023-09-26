package thread.synchronation.atm;

public class Customer extends Thread {

    private ATM atm;
    private String name;
    private int amount;

    public Customer(ATM atm, String name, int amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useATM() throws InterruptedException {
        atm.displayCheckBalance(name);
        atm.displayWithDraw(name, amount);
    }
    public void run()
    {
        try {
            useATM();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
