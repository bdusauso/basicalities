package eu.codinsanity.learning;

public class NumberOfDigits {
    public static byte byLog(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        final int length = (int) Math.ceil(Math.log10(number));

        return (byte) (number % 10 == 0 ? length + 1 : length);
    }

    public static byte byStringConversion(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        String representation = Integer.toString(number);

        return (byte) representation.length();
    }

    public static byte byDivision(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        return (byte) byDivision(number, 1);
    }

    private static int byDivision(int number, int length) {
        if (number / 10 == 0) {
            return length;
        }

        return byDivision(number / 10, length + 1);
    }
}
