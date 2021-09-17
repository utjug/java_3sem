public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.count(10, 5);
        a.show();

        B b = new B();
        b.count(10, 5);
        b.show();

        C c = new C();
        c.count(10, 5);
        c.show();

        D d = new D();
        d.count(10,5);
        d.show();
    }
}

class A {
    protected int count(int a, int b) {
        return a+b;
    }
    protected void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    protected int count(int a, int b) {
        return a-b;
    }
    @Override
    protected void show() {
        System.out.println("B");
    }
}

class C extends A {
    @Override
    protected int count(int a, int b) {
        return a*b;
    }
    @Override
    protected void show() {
        System.out.println("C");
    }
}

class D extends B {
    @Override
    protected int count(int a, int b) {
        return a/b;
    }
    @Override
    protected void show() {
        System.out.println("D");
    }
}
