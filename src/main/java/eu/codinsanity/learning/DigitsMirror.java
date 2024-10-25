package eu.codinsanity.learning;

public class DigitsMirror {

    private DigitsMirror() {}
    public static int of (int n) {
        return reverse(n, 0);
    }

    private static int reverse(int digit, int acc) {
        if (digit / 10 == 0) return acc * 10 + digit;

        return reverse(digit / 10, acc * 10 + (digit % 10));
    }
}
