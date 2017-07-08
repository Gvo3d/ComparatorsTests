package instclasstests;

/**
 * Created by Gvozd on 08.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        D d = new D();

        System.out.println("a instanceof B: "+(a instanceof B));
        System.out.println("b instanceof A: "+(b instanceof A));
        System.out.println("d instanceof C:"+(d instanceof C));
    }
}
