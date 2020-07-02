package mybasic;

@FunctionalInterface
public interface BasicClass {
    void method();

    default void defaultMethod() {
    }

    static void staticMethod(){
    }


}
