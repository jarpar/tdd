package c_param;

import a_junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParametrizedCsvSourceCalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"1,2,3", "4,5,9"})
    public void test(String a, String b, String expected) {
        Integer sum = calculator.add(Integer.valueOf(a), Integer.valueOf(b));
        Assertions.assertEquals(Integer.valueOf(expected), sum);

    }
}
