package a_junit;

import org.junit.jupiter.api.*;

import java.time.LocalTime;

public class CalculatorClass {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
    }

    Integer time;

    @BeforeEach
    public void beforeEach() {
        System.out.println("BEFORE EACH");
        time = LocalTime.now().getNano();
        System.out.println(time);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH");
        time = LocalTime.now().getNano();
        System.out.println(time);
    }

    @Test
    public void test() {
        Calculator calculator = new Calculator();

        Integer sum = calculator.add(2, 2);
        Integer substract = calculator.substract(8, 4);
        Integer multiply = calculator.multiply(2, 2);
        Integer divide = calculator.divide(8, 2);

        Assertions.assertEquals(4, sum);
        Assertions.assertEquals(4, substract);
        Assertions.assertEquals(4, multiply);
        Assertions.assertEquals(4, divide);

    }
}
