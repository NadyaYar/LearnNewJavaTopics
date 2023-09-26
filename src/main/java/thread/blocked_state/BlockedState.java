package thread.blocked_state;

public class BlockedState {
    public static void main(String[] args) {

        Thread t1 = new Thread(new DemoBlockedRunnable());
        Thread t2 = new Thread(new DemoBlockedRunnable());

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        System.out.println(t2.getState());
        System.exit(0);
    }
}
