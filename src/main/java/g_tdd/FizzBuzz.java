package g_tdd;

public class FizzBuzz {
    public String fizzBuzz(int i) {
        if (i == 3) {
            return "Fizz";
        }
        if (i == 6) {
            return "FizzBuzz";
        }
        return "Buzz";
    }
}
