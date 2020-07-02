import org.junit.jupiter.api.Test;

public class VarEqual {
    /*
     比较int 和new Integer，Integer变量区别
     */
    @Test
    public void CompareIntAndInteger(){
        int i = 10;
        Integer a = new Integer(10);
        /*
        i==a:true
        当一个int和new Integer比较的时候，
        new Integer会自动拆箱成int，所以就是两个int比较
         */
        System.out.println("i==a:"+(i==a));

        Integer a2 = 10;
        /*a==a2:false 这就相当于是String 和new String（）比较一样，
        一个是常量地址，一个地址
        String x ="xxx"
        JVM首先会对这个字面量进行检查，
        如果字符串常量池中存在相同内容的字符串对象的引用，则将这个引用返回，
        否则新的字符串对象被创建，然后将这个引用放入字符串常量池，并返回该引用

        String a = "a" + " b" + "c" + "d";
        javac编译可以对字符串常量直接相加的表达式进行优化，
        不必要等到运行期再去进行加法运算处理，而是在编译时去掉其中的加号，直接将其编译成一个这些常量相连的结果。
        上面的｛String a = "a" + " b" + "c" + "d";｝代码被编译器在编译时优化后，
        相当于直接定义了一个”abcd”的字符串，所以，题目答案应该只创建了一个String对象。
        如果是 String a="a";String b="b";String  c="c";String d=a+b+c;这里就创建了4个对象
         */
        System.out.println("a==a2:"+(a==a2));
        //i==a2:true int和Integer拆箱和装箱
        System.out.println("i==a2:"+(i==a2));

        Integer a3 = 128;
        Integer a4 = 128;
        int i2 = 128;
        int i3 = 128;
        /*Integer类内部 通过静态内部类提供了一个缓存池，范围在-128~127,超过这个范围，
         如果超过这个范围 Integer 值都是new出来的对象
         */
        System.out.println("a3==a4:"+(a3==a4));
        //还是拆箱。两个int的128相比较
        System.out.println("a3==i2:"+(a3==i2));
        System.out.println("i2==i3:"+(i2==i3));

        /*
        int转换成Integer
        int a = 3; Integer A = new Integer(3);
        或者
        Integer A = Integer.valueOf(3);

        Integer转换成int
        Integer A=new Integer(5);
        int a=A.intValue();
         */


        /*
        Double 在比较的时候，不会拆箱，所以两个Double比较值为false
         */
        double d1 = 1.1;
        double d2 = 1.1;
        System.out.println("d1==d2:"+(d1==d2));//true

        Double d3 = 1.2;
        Double d4 = 1.2;
        double dd = 1.2;
        System.out.println("d3==d4:"+(d3==d4));//false
        System.out.println("d3.equals(d4):"+d3.equals(d4));//true
        System.out.println("d3==1.2:"+(d3==1.2));
        System.out.println("d3==dd:"+(d3==dd));

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
