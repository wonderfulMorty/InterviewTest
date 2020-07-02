package mystaticblock;

/*首先，JVM调用了main方法，mian方法进栈，
此时遇到Son son = new Son()这句语句，
会将Father.class和Son.class分别加载进内存，
之后才会创建对象。我们知道，静态代码块的执行优先于对象的创建，
也就是说当Father.class加载进内存时，父类的静态代码块会随着Father.class一起加载，
然后是Son.class加载进内存，而与此同时子类的静态代码块也会随着Son.class一起加载进内存。
接下来就是进入子类的构造方法了，然后你以为就直接打印子类的构造方法里的输出了吗，
你太天真了，要知道java是分层初始化的，
先初始化父类，才初始化子类（你爸爸始终还是你爸爸，得先有你爸爸才有你，这是一个道理）
。然后，还有注意构造代码块优先于构造方法执行的，所以第三个输出的是父构造代码块，
第四个输出的是父构造方法，而后才是子类的初始化。

 */
public class TestMyBlock {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father{
    static {
        System.out.println("父静态代码块");            //1
    }
    {
        System.out.println("父构造代码块");            //3
    }
    Father(){
        System.out.println("父构造方法");              //4
    }
}
class Son extends Father{
    static {
        System.out.println("子静态代码块");            //2
    }
    {
        System.out.println("子构造代码块");            //5
    }
    Son(){
        System.out.println("子构造方法");              //6
    }
}

