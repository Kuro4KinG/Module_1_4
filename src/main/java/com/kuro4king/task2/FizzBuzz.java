public class FizzBuzz {
    int number;

    public FizzBuzz(int n) {
        number = n;
    }

    public void fizz() {
        if (number % 3 == 0 && number % 5 != 0) System.out.print("fizz ");
    }

    public void buzz() {
        if (number % 5 == 0 && number % 3 != 0) System.out.print("buzz ");
    }

    public void fizzbuzz() {
        if (number % 3 == 0 && number % 5 == 0) System.out.print("fizzbuzz ");
    }

    public void number() {
        if (number % 3 != 0 && number % 5 != 0) System.out.print(number + " ");
    }

}
