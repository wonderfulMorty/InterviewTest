package myclone;

public class Son {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone()  {
        Object o = null;
        try {
            o = (Son)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  o;
    }

    @Override
    public String toString() {
        return "Son{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
