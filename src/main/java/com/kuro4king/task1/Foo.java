
import java.util.concurrent.Semaphore;

public class Foo {
    static Semaphore semA = new Semaphore(1);
    static Semaphore semB = new Semaphore(0);
    static Semaphore semC = new Semaphore(0);

    public void first() {
        try {
            semA.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("first");
        semB.release();
    }

    public void second() {
        try {
            semB.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("second");
        semC.release();
    }

    public void third() {
        try {
            semC.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("third\n");
        semA.release();
    }
}
