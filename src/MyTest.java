import java.io.*;
import java.util.Date;
import java.util.concurrent.locks.Lock;

public class MyTest {
    public static void main(String[] args) {
         /*
        Double 在比较的时候，不像Integer有缓存区间-127——127
         */
        double d1 = 1.1;
        double d2 = 1.1;
        System.out.println("d1==d2:"+(d1==d2));//true

        Double d3 = 1.2;
        Double d4 = 1.2;
        double dd = 1.2;
        System.out.println("d3==d4:"+(d3==d4));//false
        System.out.println("d3.equals(d4):"+d3.equals(d4));//true
        System.out.println("d3==1.2:"+(d3==1.2));//true
        System.out.println("d3==dd:"+(d3==dd));//true

        Integer i1 = 1;
        Integer i4 = 1;
        System.out.println("i1==i2:"+(i1==i4));//true

        float f1 = 1.3f;
        float f2 = 1.3f;
        System.out.println("f1==f2:"+(f1==f2));//true

        Float f3 = 1.4f;
        Float f4 = 1.4f;
        System.out.println("f3==f4:"+(f3==f4));//false
        System.out.println("f3.equals(f4):"+f3.equals(f4));//true


    }
}
