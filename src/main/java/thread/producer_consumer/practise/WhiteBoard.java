package thread.producer_consumer.practise;

public class WhiteBoard {

    private String text;
    int numberOfStudent = 0;
    int count = 0;

    synchronized public void write(String t) {
        System.out.println("Teacher is writing " + t);
        while (count != 0)
            try {
                wait();
            } catch (Exception e) {
            }

        text = t;
        count = numberOfStudent;
        notifyAll();
    }

    synchronized public String read() {
        String t;
        while (count == 0)
            try {
                wait();
            } catch (Exception e) {
            }

        t = text;
        count--;
        if (count == 0)
            notify();
        return t;
    }

    public void attend() {
        numberOfStudent++;
    }
}
