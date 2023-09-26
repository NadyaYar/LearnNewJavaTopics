package thread.timed_waiting_state;

public class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {
        DemoTinedWaitingRunnable demoTinedWaitingRunnable = new DemoTinedWaitingRunnable();
        Thread t1 = new Thread(demoTinedWaitingRunnable);
        t1.start();

        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}
