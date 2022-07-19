package q4;

public class Main {

    public static void main(String[] args) {
        A a1 = new A();
        A e1 = new E();
        E c1 = new C();
        C b1 = new B();
        C d1 = new D();

        ((E)e1).f();
        ((B)b1).f();
        ((D)b1).f();

    }
}
