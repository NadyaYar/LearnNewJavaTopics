package thread.synchronation;

public class MyThread2 extends Thread{
        MyData myData;

        public MyThread2(MyData myData) {
            this.myData = myData;
        }

        public void run(){
            myData.display("Welcome");
        }
    }

