package myclone;

public class MyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Son s = new Son();
        s.setAge(10);
        s.setName("小明");
        Parent p = new Parent();
        p.setSon(s);
        p.setId(1);
        p.setPname("王先生");
        System.out.println("p:"+p);


        Parent p2 = (Parent) p.clone();
        s.setAge(16);
        s.setName("小张");
        p2.setId(2);
        p2.setPname("刘女士");
        System.out.println("p2:"+p2);
        System.out.println("p:"+p);
    }
}
