package dustin.examples;

import static java.lang.System.out;
public class MyClass
{
    class A {

    }

    class B extends A {

    }

    public void m1(B b) {
        out.println("I'm B");

    }

    public void m1(Object b) {
        out.println("I'm Object");

    }

    public void test() {
        B b = new B();
        try {
            out.println(b.getClass());
            out.println(Class.forName("dustin.examples.MyClass$B"));
            A a = b;
            m1(b.getClass().cast(a));
            Class mc =Class.forName("dustin.examples.MyClass$B").asSubclass(A.class); 
            out.println(mc);
            m1(mc.cast(a));
        }
        catch (Exception e) {

        }
    }

}

