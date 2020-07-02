package mythread.basic.distg;


public class ThreadDemo1 {

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}

