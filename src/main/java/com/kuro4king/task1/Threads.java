public class Threads {
    public Threads() {
        Foo foo = new Foo();
        Thread A = new Thread(foo::first);
        Thread B = new Thread(() -> {
            try {
                A.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foo.second();
        });
        Thread C = new Thread(() -> {
            try {
                B.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foo.third();
        });
        A.start();
        B.start();
        C.start();
    }

}
