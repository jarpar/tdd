package g_tddTest;


import g_tdd.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz_whenPasing3_shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.fizzBuzz(3);
        Assertions.assertThat(value).isEqualTo("Fizz");
    }
}
