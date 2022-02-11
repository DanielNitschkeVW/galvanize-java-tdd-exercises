import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void testFizzBuzz_isFizzForDivisibleByThree() {
        // GIVEN
        int input = 3;

        // WHEN
        String output = FizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "Fizz";
        assertEquals(expected, output);
    }

    @Test
    public void testFizzBuzz_isBuzzForDivisibleByFive() {
        // GIVEN
        int input = 5;

        // WHEN
        String output = FizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "Buzz";
        assertEquals(expected, output);
    }

    @Test
    public void testFizzBuzz_isFizzBuzzForDivisibleByThreeAndFive() {
        // GIVEN
        int input = 15;

        // WHEN
        String output = FizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "FizzBuzz";
        assertEquals(expected, output);
    }

    @Test
    public void testFizzBuzz_isNumberForNotDivisibleByThreeAndFive() {
        // GIVEN
        int input = 101;

        // WHEN
        String output = FizzBuzz.fizzBuzz(input);

        // THEN
        String expected = "101";
        assertEquals(expected, output);
    }
}