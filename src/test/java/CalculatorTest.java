import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-3, calculator.dif(2, 5));
        assertEquals(0, calculator.dif(0, 0));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(6, -3));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-10, calculator.times(2, -5));
        assertEquals(0, calculator.times(0, 0));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.solver(2, 3));
        assertEquals(-3, calculator.solver(2, 5));
        assertEquals(8, calculator.solver(5, 3));
    }
}