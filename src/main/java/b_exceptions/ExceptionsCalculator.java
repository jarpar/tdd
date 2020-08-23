package b_exceptions;

public class ExceptionsCalculator {

    public Integer divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("NULL ARGUMENT");
        }

        if (b == 0) {
            throw new IllegalArgumentException("DIVIDE BY 0");
        }
        return a / b;
    }
}
