package c_param;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceTest {
    @ParameterizedTest
    @MethodSource("data")
    public void test(Integer i) {
        Assertions.assertTrue(i % 2 == 0);
    }

    static Stream<Integer> data() {
        return Stream.of(2, 4, 6, 8, 10);
    }
}
