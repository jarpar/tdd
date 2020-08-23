package g_tdd;

public class FizzBuzz {
    public String fizzBuzz(int i) {
        if (i % 3 == 0 &&    i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else
            return "Buzz";
    }
}
