package mythread.basic;
/*
如果一个进程只剩下守护线程，那么进程就会自动结束。
守护线程通常会被用来做日志，性能统计等工作。
 */
public class TestDaemonThread {
    public static void main(String[] args) {

        Thread t1= new Thread(){
            public void run(){
                int seconds =0;

                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);

                }
            }
        };
        t1.setDaemon(true);
        t1.start();

    }
}
