public class Threads {

    public Threads() {
        Foo foo = new Foo();
        Thread A = new Thread(foo::first);
        Thread B = new Thread(foo::second);
        Thread C = new Thread(foo::third);
        A.start();
        B.start();
        C.start();
    }
}
