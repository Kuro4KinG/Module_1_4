import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FizzBuzz {
    int number;
    CyclicBarrier cb = new CyclicBarrier(4);

    public FizzBuzz(int n) {
        number = n;
    }

    public void fizz() {
        if (number % 3 == 0 && number % 5 != 0) System.out.print("fizz ");
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public void buzz() {
        if (number % 5 == 0 && number % 3 != 0) System.out.print("buzz ");
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public void fizzbuzz() {
        if (number % 3 == 0 && number % 5 == 0) System.out.print("fizzbuzz ");
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public void number() {
        if (number % 3 != 0 && number % 5 != 0) System.out.print(number + " ");
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
