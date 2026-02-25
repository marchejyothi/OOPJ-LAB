// Class A
class A {
    void callme() {
        System.out.println("Inside callme() of class A");
    }
}

// Class B extending A
class B extends A {
    void callme() {
        System.out.println("Inside callme() of class B");
    }
}

// Class C extending A
class C extends A {
    void callme() {
        System.out.println("Inside callme() of class C");
    }

    // Additional method in class C
    void callme1() {
        System.out.println("Inside callme1() of class C");
    }
}

// Main class
public class Dispatch {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        A r;   // Superclass reference

        r = a;
        r.callme();   // Calls A's version

        r = b;
        r.callme();   // Calls B's version

        r = c;
        r.callme();   // Calls C's version (Dynamic Method Dispatch)

        // callme1() is not available through reference r
        // r.callme1();  // ? Compile-time error

        // To call callme1(), use object of class C
        c.callme1();   // ? Valid
    }
}