package co.bjit.practice;

public class MultiThreadingMain {


    public static void main(String[] args) {

        for (int i =0; i<5 ; i++){
            MultithreadingThing myThing = new MultithreadingThing(i);
            myThing.start();
        }

    }
}

class MultithreadingThing extends Thread {

    public int threadNumber;
    public MultithreadingThing(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for (int i=0 ; i<5 ; i++){
            System.out.println(i +" of the Thread Number "+ this.threadNumber);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }



    }
}