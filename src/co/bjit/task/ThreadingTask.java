package co.bjit.task;

public class ThreadingTask {
    public static void main(String[] args) {

        MyThreads mt = new MyThreads();

        new OddThread(mt);
        new EvenThread(mt);
        
    }
}
class MyThreads {

    int num;
    boolean isEven = false;

    public synchronized void PrintOddThread(int num) {
        if (isEven) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.num = num;
        System.out.println("Odd Thread : " + num);
        isEven=true;
        notify();
    }

    public synchronized void PrintEvenThread(int num) {
        if (!isEven) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.num = num;
        System.out.println("Even Thread : " + num);
        isEven=false;
        notify();

    }


}

class EvenThread implements Runnable {

    MyThreads mt;

    public EvenThread(MyThreads mt) {
        this.mt = mt;
        Thread t = new Thread(this, "EvenThread");
        t.start();
    }

    @Override
    public void run() {
        int i = 2;
        while (i <= 10) {
            mt.PrintEvenThread(i);
            i += 2;

        }


    }
}


class OddThread implements Runnable {

    MyThreads mt;

    public OddThread(MyThreads mt) {
        this.mt = mt;
        Thread t = new Thread(this, "OddThread");
        t.start();
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            mt.PrintOddThread(i);
            i += 2;

        }


    }
}



