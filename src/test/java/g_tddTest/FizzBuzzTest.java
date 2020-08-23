package g_tddTest;


import g_tdd.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz_whenPassing3_shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.fizzBuzz(3);
        Assertions.assertThat(value).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzz_whenPassing5_shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.fizzBuzz(5);
        Assertions.assertThat(value).isEqualTo("Buzz");
    }

    @Test
    public void fizzBuzz_whenPassing6_shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.fizzBuzz(6);
        Assertions.assertThat(value).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzz_whenPassing15_shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.fizzBuzz(15);
        Assertions.assertThat(value).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzBuzz_whenPassing30_shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.fizzBuzz(30);
        Assertions.assertThat(value).isEqualTo("FizzBuzz");
    }
}
