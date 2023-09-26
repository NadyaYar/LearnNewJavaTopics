package thread.wait_notify;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {

    private Data date;

    public Sender(Data date) {
        this.date = date;
    }

    public void run() {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "End"
        };

        for (String packet : packets) {
            date.send(packet);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
    }
}
