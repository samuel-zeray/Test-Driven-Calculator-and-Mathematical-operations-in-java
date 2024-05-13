import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test {
     Calculator sample= new Calculator();
   //addition
   @test
   public void testaddition(){
    assertequals(,sample.calculateaddition(3,7))
   }
   //subtraction
   @test
   public void testaddition(){
    assertequals(,sample.calculateaddition(3,7))
   }
   //multiplication
   @test
   public void testaddition(){
    assertequals(,sample.calculateaddition(3,7))
   }
   //division
   @test
   public void testaddition(){
    assertequals(,sample.calculateaddition(3,7))
   }
   // Factorial
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, sample.calculateFactorial(0));
    }
    
    @Test
    public void testFactorialOfOne() {
        assertEquals(1,sample.calculateFactorial(1));
    }
    
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, sample.calculateFactorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        sample.calculateFactorial(-5);
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
        assertEquals(3, sample.calculateCombination(3, 2));
    }
    
    @Test
    public void testCombinationWithSameNumbers() {
        assertEquals(1, sample.calculateCombination(5, 5));
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

            //power

  @Test
    public void testPower() {
        assertEquals(8.0, sample.power(2.0, 3.0)); 
    }

            //squarRoot 
    @Test
    public void testSquareRoot() {
        assertEquals(2.0, sample.squareRoot(4.0)); 
    }

        //logarithm 
    @Test
    public void testLogarithm() {
        assertEquals(2.0, sample.logarithm(100.0)); // log10(100) = 2
    }


      //naturalLogarithm 
    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.6094379124341003, sample.naturalLogarithm(5.0)); // ln(5) = 1.609
    }
}
