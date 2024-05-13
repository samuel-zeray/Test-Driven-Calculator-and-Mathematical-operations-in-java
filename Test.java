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


}
