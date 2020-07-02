import org.junit.jupiter.api.Test;

public class TryFinallyExecute {

    @Test
    public void myTest(){
        System.out.println(test1());
        //System.out.println(test11());
    }

    public int test1() {
        int b = 20;

        try {
            System.out.println("try block");

            return b += 80;
        }
        catch (Exception e) {

            System.out.println("catch block");
        }
        finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }
        }

        return b;
    }

    public static String test11() {
        try {
            System.out.println("try block");

            return test12();
        } finally {
            System.out.println("finally block");
        }
    }

    public static String test12() {
        System.out.println("return statement");

        return "after return";
    }
}
