package thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread my = new MyThread();

        my.start();

        int i = 1;
        while (true) {
            System.out.println(i + "world");
            i++;
        }
    }
}
