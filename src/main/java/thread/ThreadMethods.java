package thread;

class MyRun implements Runnable {

    @Override
    public void run() {

    }
}

class MyThreadRun extends Thread {

    public MyThreadRun(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException i) {
                System.out.println(i);
            }
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRun(), "My name");
        MyThreadRun tR = new MyThreadRun("My Thread 1");
        Thread t1 = new Thread(tR);

        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(tR.getPriority());
        System.out.println(t.getState());
        System.out.println(t.isAlive());

        tR.start();
        tR.interrupt();
    }
}
