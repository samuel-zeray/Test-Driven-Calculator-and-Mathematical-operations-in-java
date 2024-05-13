import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Test {
     Calculator sample= new Calculator();
   //addition
   @test
   public void testaddition(){
    assertequals(10,sample.calculateaddition(3,7))
   }
   //subtraction
   @test
   public void testsubtraction(){
    assertequals(3,sample.calculatesubtraction(10,7))
   }
   //multiplication
   @test
   public void testmultiplication(){
    assertequals(10,sample.calculatmultiplication(2,4))
   }
   //division
   @test
   public void testdivision(){
    assertequals(5,sample.calculatedivision(20,4))
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
        assertEquals(6, sample.calculatePermutation(3, 2));
    }
    
    @Test
    public void testPermutationWithSameNumbers() {
        assertEquals(1, sample.calculatePermutation(5, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutationWithNegativeNumberN() {
        sample.calculatePermutation(-3, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutationWithNegativeNumberR() {
        sample.calculatePermutation(3, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutationWithRGreaterThanN() {
        sample.calculatePermutation(2, 3);
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
        sample.calculateCombination(-3, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCombinationWithNegativeNumberR() {
        sample.calculateCombination(3, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCombinationWithRGreaterThanN() {
       sample.calculateCombination(2, 3);
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


     //Inverse Trigonometric functions 

    @Test
    public void testInverseSin() {
        assertEquals(0.5, sample.inverseSin(Math.sin(0.5)), 0.0001);
    }

    @Test
    public void testInverseCos() {
        assertEquals(0.5, sample.inverseCos(Math.cos(0.5)), 0.0001);
    }

    @Test
    public void testInverseTan() {
        assertEquals(0.5, sample.inverseTan(Math.tan(0.5)), 0.0001);
    }

    @Test
    public void testInverseSec() {
        assertEquals(2.0, sample.inverseSec(1 / Math.cos(0.5)), 0.0001);
    }

    @Test
    public void testInverseCot() {
        assertEquals(2.0, sample.inverseCot(1 / Math.tan(0.5)), 0.0001);
    }

     @Test
    public void testInverseCsc() {
        assertEquals(2.0, sample.inverseCsc(1 / Math.sin(0.5)), 0.0001);
    }

}
