package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int order) {
        String countOffString = "";
        if (order % 3 == 0) {
            countOffString += FIZZ;
        }
        if (order % 5 == 0) {
            countOffString += BUZZ;
        }
        if (order % 7 == 0) {
            countOffString += WHIZZ;
        }
        return countOffString.isEmpty() ? Integer.toString(order) : countOffString;
    }
}
