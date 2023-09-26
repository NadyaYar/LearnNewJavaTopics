package thread;

public class RunnableMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        int i = 1;
        while (true) {
            System.out.println(i + "world");
            i++;
        }
    }
}
