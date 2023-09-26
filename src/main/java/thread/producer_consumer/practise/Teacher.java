package thread.producer_consumer.practise;

public class Teacher extends Thread {

    private WhiteBoard whiteBoard;
    private String notes[] = {"Hello", "Java", "My love", "end"};

    public Teacher(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        for (int i = 0; i < notes.length; i++)
            whiteBoard.write(notes[i]);
    }

}
