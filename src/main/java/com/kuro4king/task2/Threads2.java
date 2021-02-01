import java.util.concurrent.*;

public class Threads2 {
    public Threads2(int i) throws InterruptedException {
        FizzBuzz fb = new FizzBuzz(i);
        CyclicBarrier cb = new CyclicBarrier(4);
        Thread A = new Thread(() -> {
            fb.fizz();
            try {
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        Thread B = new Thread(() -> {
            fb.buzz();
            try {
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        Thread C = new Thread(() -> {
            fb.fizzbuzz();
            try {
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        Thread D = new Thread(() -> {
            fb.number();
            try {
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        A.start();
        B.start();
        C.start();
        D.start();
        Thread.sleep(500); // для корректного вывода

    }
}
