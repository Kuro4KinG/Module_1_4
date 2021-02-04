public class Threads2 {
    public Threads2(int i) {
        FizzBuzz fb = new FizzBuzz(i);
        Thread A = new Thread(fb::fizz);
        Thread B = new Thread(fb::buzz);
        Thread C = new Thread(fb::fizzbuzz);
        Thread D = new Thread(fb::number);
        A.start();
        B.start();
        C.start();
        D.start();
        try {
            Thread.sleep(500);          // для корректного вывода
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
