package c_param;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTest {
    @ParameterizedTest
    @CsvSource({"test,TEST", "Java,JAVA", "qwertyuiop, QWERTYUIOP"})
    public void test(String input, String expected) {
        Assertions.assertEquals(expected, input.toUpperCase());
    }
}
