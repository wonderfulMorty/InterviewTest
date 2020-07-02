package interviewtest;


import org.junit.jupiter.api.Test;

/*
澳加迪面试题
 */
public class MyTest1 {
   @Test
    public  void  mytest_1(){
        int n = getValue(2);
        System.out.println(n);//10
    }

    @Test
    public void mytest_2(){
       int i;
       int a[] = {11,22,33,44,55,66,77,88,99};
       for ( i=0;i<=a.length/2;i++){
           System.out.print(a[i]+a[a.length-i-1]+"");
           System.out.println();
       }
    }

    @Test
    public void mytest_3(){
       B b1 = new B(5);
       B b2 = new B(5);
       System.out.println(b1==b2);//false
       System.out.println(b1.equals(b2));//false
    }

    @Test
    public void mytest_4(){
       //ABDCBDCB
        int i = 0;
        for (foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');
        }
    }

    @Test
    public void mytest_5(){
        int n = f();
        System.out.println("n:" + n);
    }

    public int f(){
        int i=10;
        try {
            i = 20;
            return i;
        }catch (Exception e){
            return 0;
        }finally {
            i = 30;
        }
    }




    /*
    执行case2和case3,因为case1 不满足，不执行，case2 还没有遇到return，直至执行结束。
     */
    public static int getValue(int i){
        int result = 0 ;
        switch (i){
            case 1:
                result = result +i;
            case 2:
                result = result + i*2;
            case 3:
                result = result +i*3;
        }
        return  result;
    }

    public static boolean foo(char c){
        System.out.print(c);
        return  true;
    }


}
