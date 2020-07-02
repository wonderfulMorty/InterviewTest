package mythread.basic.distg;

public class ThreadTest implements Runnable{
    private int tickets = 10;

    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName()
                        + " is saling ticket " + tickets--);
            } else {
                break;
            }
        }
    }
}
