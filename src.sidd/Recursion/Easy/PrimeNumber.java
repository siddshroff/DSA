package Recursion.Easy;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        int number = 15;
        System.out.println(obj.isPrime(number, 2));
    }

    private boolean isPrime(int number, int i) {
        // Base cases
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % i == 0)
            return false;
        if (i * i > number)
            return true;

        // Check for next divisor
        return isPrime(number, i + 1);
    }
}
