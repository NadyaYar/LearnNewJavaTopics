package thread.synchronation;

public class MyThread1 extends Thread {
    MyData myData;

    public MyThread1(MyData myData) {
        this.myData = myData;
    }

    public void run(){
        myData.display("Hello world");
    }
}
