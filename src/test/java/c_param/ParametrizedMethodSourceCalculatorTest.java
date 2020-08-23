package c_param;

import a_junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedMethodSourceCalculatorTest {
    Calculator calculator = new Calculator();

    @ParameterizedTest
    @MethodSource("data")
    public void test(int a, int b, int expected) {
        Integer sum = calculator.add(a, b);
        Assertions.assertEquals(expected, sum);
    }

    static public Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(4, 5, 9)
        );
    }
}
