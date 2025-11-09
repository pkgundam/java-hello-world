import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddPositiveNumbers() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, Calculator.add(-2, -3));
    }

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(1, Calculator.subtract(-2, -3));
    }

    @Test
    void testConstructor() {
        assertDoesNotThrow(() -> new Calculator());
    }
}