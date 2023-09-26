package thread.synchronation.atm;

public class ATM {

  public synchronized  void displayCheckBalance(String name) throws InterruptedException {
        System.out.println(name + " has a lot of money");
        Thread.sleep(1000);
    }

    public synchronized void displayWithDraw(String name , int amount) throws InterruptedException {
        System.out.println(name + " had withdraw " + amount);
        Thread.sleep(1000);
    }


}
