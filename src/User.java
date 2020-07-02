import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -7020619477594468968L;
    private String name;
    private Age age;
    private int length;

    public User() {
    }

    public User(String name, Age age, int length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", length=" + length +
                '}';
    }
}
