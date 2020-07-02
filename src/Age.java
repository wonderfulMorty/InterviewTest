
import java.io.Serializable;

public class Age implements Serializable {

    private static final long serialVersionUID = 2912174049707358390L;
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public Age() {
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                '}';
    }
}
