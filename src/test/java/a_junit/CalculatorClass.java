package a_junit;

import org.junit.jupiter.api.*;

public class CalculatorClass {
    Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BEFORE EACH");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH");
        System.out.println();
    }

    @Test
    public void sum_2Plus2_shouldBeEqualTo4() {
        Integer sum = calculator.add(2, 2);
        Assertions.assertEquals(4, sum);

    }

    @Test
    public void substract_4From8_shouldBeEqualTo4() {
        Integer substract = calculator.substract(8, 4);
        Assertions.assertEquals(4, substract);
    }

    @Test
    public void multiply_2And2_shoulEqualTo4() {
        Integer multiply = calculator.multiply(2, 2);
        Assertions.assertEquals(4, multiply);
    }

    @Test
    public void divide_8By2_shouldBe4() {
        Integer divide = calculator.divide(8, 2);
        Assertions.assertEquals(4, divide);
    }
}
