import java.util.concurrent.Phaser;

public class Start {
    int num;

    public Start(int n) throws InterruptedException {
        num = n;
        for (int i = 1; i <= num; i++) {
            new Threads2(i);
        }
    }
}
