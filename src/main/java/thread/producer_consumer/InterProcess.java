package thread.producer_consumer;

public class InterProcess {
    public static void main(String[] args) {
        Data data = new Data();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
