package thread.producer_consumer;

import thread.producer_consumer.Data;

public class Producer extends Thread {
    Data data;

    public Producer(Data d) {
        data = d;
    }

    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}
