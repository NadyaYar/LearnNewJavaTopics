package thread.producer_consumer.practise;

public class Student extends Thread {

    private String name;
    private WhiteBoard whiteBoard;

    public Student(String n, WhiteBoard w) {
        name = n;
        whiteBoard = w;
    }

    @Override
    public void run() {
        String text;
        whiteBoard.attend();
        do {
            text = whiteBoard.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}
