package thread.producer_consumer;

public class Data {
    private int value;

    private boolean flag = true;

    synchronized public void set(int v) {
        while (flag != true)
            try {
                wait();
            } catch (Exception e) {
            }

        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false)
            try {
                wait();
            } catch (Exception e) {
            }

        x = value;
        flag = true;
        notify();
        return x;
    }
}
