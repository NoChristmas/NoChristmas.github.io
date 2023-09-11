package StudyingJava;

abstract class A {
    public abstract int b();

    //public abstact int c(){System.out.println("Hello")}
    public void d() {
        System.out.println("world");
    }
}
class B extends A {
    public int b() {
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();

    }
}
