package tdd;

public class FizzBuzz {
    public static String fizzbuzz(int number) {

        if (number % 5 == 0 && number % 3 == 0) {
            return "fizzbuzz";
        }

        if (number % 3 == 0) {
            return "fizz";
        }

        if (number % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(number);
    }
}
