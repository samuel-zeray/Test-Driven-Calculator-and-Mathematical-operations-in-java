import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test {
     Calculator p= new Calculator();

   
   // Factorial
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, p.calculateFactorial(0));
    }
    
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, p.calculateFactorial(1));
    }
    
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, p.calculateFactorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        p.calculateFactorial(-5);
    }


           // Permutation    
    @Test
    public void testPermutationOfTwoNumbers() {
        assertEquals(6, p.calculatePermutation(3, 2));
    }
    
    @Test
    public void testPermutationWithSameNumbers() {
        assertEquals(1, p.calculatePermutation(5, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutationWithNegativeNumberN() {
        p.calculatePermutation(-3, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutationWithNegativeNumberR() {
        p.calculatePermutation(3, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutationWithRGreaterThanN() {
        p.calculatePermutation(2, 3);
    }

            // Combination

    @Test
    public void testCombinationOfTwoNumbers() {
        assertEquals(3, p.calculateCombination(3, 2));
    }
    
    @Test
    public void testCombinationWithSameNumbers() {
        assertEquals(1, p.calculateCombination(5, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCombinationWithNegativeNumberN() {
        p.calculateCombination(-3, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCombinationWithNegativeNumberR() {
        p.calculateCombination(3, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCombinationWithRGreaterThanN() {
        p.calculateCombination(2, 3);
    }

  @Test
    public void testPower() {
        MathCalculator calculator = new MathCalculator();
        assertEquals(8.0, calculator.power(2.0, 3.0), DELTA); // 2^3 = 8
    }

    @Test
    public void testSquareRoot() {
        MathCalculator calculator = new MathCalculator();
        assertEquals(2.0, calculator.squareRoot(4.0), DELTA); // sqrt(4) = 2
    }

    @Test
    public void testLogarithm() {
        MathCalculator calculator = new MathCalculator();
        assertEquals(2.0, calculator.logarithm(100.0), DELTA); // log10(100) = 2
    }

    @Test
    public void testNaturalLogarithm() {
        MathCalculator calculator = new MathCalculator();
        assertEquals(1.6094379124341003, calculator.naturalLogarithm(5.0), DELTA); // ln(5) = 1.609
    }
}
