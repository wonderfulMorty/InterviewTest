package mythread.basic.runstart;

public class MyTest {
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                pong();
            }
        };

        t.setPriority(Thread.MAX_PRIORITY);
        //t.run();
        t.start();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }
}
