package thread.producer_consumer;

import thread.producer_consumer.Data;

public class Consumer extends Thread{

    Data date;

    public Consumer(Data d){
        date=d;
    }

    public void run(){
        int value ;
        while(true){
            value=date.get();
            System.out.println("Consumer " + value);
        }
    }
}
