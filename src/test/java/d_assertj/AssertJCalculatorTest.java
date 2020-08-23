package d_assertj;

import b_exceptions.ExceptionsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJCalculatorTest {

    @Test
    public void divideByNullTest() {
        ExceptionsCalculator exceptionsCalculator = new ExceptionsCalculator();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    exceptionsCalculator.divide(null, 1);
                }).withMessage("NULL ARGUMENT");
    }

    @Test
    public void divideByZeroTest() {
        ExceptionsCalculator exceptionsCalculator = new ExceptionsCalculator();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    exceptionsCalculator.divide(1, 0);
                }).withMessage("DIVIDE BY 0");
    }
}
