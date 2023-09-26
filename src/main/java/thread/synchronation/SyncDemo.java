package thread.synchronation;

public class SyncDemo {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t.start();
        t2.start();
    }
}
