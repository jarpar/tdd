package b_exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionsCalculatorTest {
    @Test
    public void divide_WhenPassingNullAsFirstParameter_shouldThrowAnException() {
        ExceptionsCalculator exceptionsCalculator = new ExceptionsCalculator();
        try {
            exceptionsCalculator.divide(null, 2);
            Assertions.fail("expected exception");
        } catch (Exception e) {
            Assertions.assertEquals("NULL ARGUMENT", e.getMessage());
        }
    }

    @Test
    public void divide_WhenPassingNullAsSecondParameter_shouldThrowAnException() {
        ExceptionsCalculator exceptionsCalculator = new ExceptionsCalculator();
        try {
            exceptionsCalculator.divide(2, null);
            Assertions.fail("expected exception");
        } catch (Exception e) {
            Assertions.assertEquals("NULL ARGUMENT", e.getMessage());
        }
    }

    @Test
    public void divide_WhenDivideByZero_shouldThrowAnException() {
        ExceptionsCalculator exceptionsCalculator = new ExceptionsCalculator();
        try {
            exceptionsCalculator.divide(2, 0);
            Assertions.fail("expected exception");
        } catch (Exception e) {
            Assertions.assertEquals("DIVIDE BY 0", e.getMessage());
        }
    }
}
