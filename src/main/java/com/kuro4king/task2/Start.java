public class Start {
    int num;

    public Start(int n) {
        num = n;
        for (int i = 1; i <= num; i++) {
            new Threads2(i);
        }
    }
}
