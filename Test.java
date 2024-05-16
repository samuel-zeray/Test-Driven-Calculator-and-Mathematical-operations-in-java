import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Test {
     Calculator sample= new Calculator();
     //basic areas shape computation
    @Test
    public void testAreaOfRectangle(){
        assertEquals(1.0,sample.areaOfRectangle(3.0,1.0)); 
        assertEquals(4.0,sample.areaOfRectangle(2.0,2.0)); 
    }
    @Test
    public void testAreaOfSquare(){
        assertEquals(25,sample.areaOfRectangle(5)); 
        assertEquals(15,sample.areaOfRectangle(4)); 
    }
    @Test
    public void testAreaOfCircle(){
        assertEquals(100,sample.areaOfCircle(50.0)); 
        assertEquals(31.4,sample.areaOfCircle(10.0)); 
    }
    //test case of trinagle function
    @Test
    public void testCalculateArea() {
        // Test case 1: Normal case
        double base = 10;
        double height = 5;
        double expectedArea = 25.0;
        double actualArea = TriangleAreaCalculator.calculateArea(base, height);
        assertEquals(expectedArea, actualArea, "The area should be 25.0");

        // Test case 2: Base and height are 1
        base = 1;
        height = 1;
        expectedArea = 0.5;
        actualArea = TriangleAreaCalculator.calculateArea(base, height);
        assertEquals(expectedArea, actualArea, "The area should be 0.5");

        // Test case 3: Base and height are large values
        base = 10000;
        height = 20000;
        expectedArea = 100000000.0;
        actualArea = TriangleAreaCalculator.calculateArea(base, height);
        assertEquals(expectedArea, actualArea, "The area should be 100000000.0");

        // Test case 4: Invalid input (negative base)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(-10, 5);
        });
        assertEquals("Base and height must be positive numbers.", exception.getMessage());

        // Test case 5: Invalid input (zero height)
        exception = assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(10, 0);
        });
        assertEquals("Base and height must be positive numbers.", exception.getMessage());
    }

      //body mass index
    @Test
    public void testBodyMassIndex(){
        assertEquals(1,sample.bodyMassIndex(50.0,1.75));
        assertEquals(0,sample.bodyMassIndex(60.0,1.4));
        assertEquals(-1,sample.bodyMassIndex(50.0,1.65));
    }
   //addition
   @test
   public void testaddition(){
           assertequals(10.0,sample.calculateaddition(3.0,7.0));
           assertequals(3.0,sample.calculateaddition(2.0,2.0));
   }
   //subtraction
   @test
   public void testsubtraction(){
           assertequals(3.0,sample.calculatesubtraction(10.0,7.0));
           assertequals(3.0,sample.calculatesubtraction(3.0,2.0));
   }
   //multiplication
   @test
   public void testmultiplication(){
           assertequals(10.0,sample.calculatemultiplication(2.0,4.0));
           assertequals(12.0,sample.calculatemultiplication(3.0,4.0));
   }
   //division with float 
   @test
   public void testdivisionWITHFLOAT(){
            assertequals(5.0,sample.calculatedivision(20.0,4.0));
            assertequals('INFINITY',sample.calculatedivision(20.0,0.0));
            assertequals(0,sample.calculatedivision(0.0,4.0));
            assertequals(2.0,sample.calculatedivision(10.0,4.0));
   }
   //division with integer
   @Test(expected = IllegalArgumentException.class)
   public void DestDivisionWITHINTEGER() {
     assertequals(5,sample.calculatedivision(5.0,1.0));
     assertequals(0,sample.calculatedivision(5.0,0.0));//the "RUN:UNDEFINED".
     assertequals(5.0,sample.calculatedivision(20.0,3.0));
   //Trigonometric testcases
   @Test
    public void testSine() {
        assertEquals(0.0, TrigonometricFunctions.sine(0), 0.001);
        assertEquals(1.0, TrigonometricFunctions.sine(90), 0.001);
        assertEquals(0.0, TrigonometricFunctions.sine(180), 0.001);
        assertEquals(-1.0, TrigonometricFunctions.sine(270), 0.001);
        assertEquals(0.5, TrigonometricFunctions.sine(30), 0.001);
    }

    @Test
    public void testCosine() {
        assertEquals(1.0, TrigonometricFunctions.cosine(0), 0.001);
        assertEquals(0.0, TrigonometricFunctions.cosine(90), 0.001);
        assertEquals(-1.0, TrigonometricFunctions.cosine(180), 0.001);
        assertEquals(0.0, TrigonometricFunctions.cosine(270), 0.001);
        assertEquals(0.866, TrigonometricFunctions.cosine(30), 0.001);
    }

    @Test
    public void testTangent() {
        assertEquals(0.0, TrigonometricFunctions.tangent(0), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, TrigonometricFunctions.tangent(90), 0.001);
        assertEquals(0.0, TrigonometricFunctions.tangent(180), 0.001);
        assertEquals(Double.NEGATIVE_INFINITY, TrigonometricFunctions.tangent(270), 0.001);
        assertEquals(0.577, TrigonometricFunctions.tangent(30), 0.001);
    }
    // Median Test case
    @Test
    public void testMedian() {
        int[] numbers = {5, 9, 2, 7, 4, 6, 8, 1, 3};
        ouble expectedMedian = 5.0;
        double median = calculateMedian(numbers);
        assertEquals(expectedMedian, median, 0.001);
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
              
    
    //  UNIT CONVERSION

          // length converter
          @Test
          public void testMeterToCentimeter() {
              assertEquals(100, sample.meterToCentimeter(1), 0.001);
              assertEquals(200, sample.meterToCentimeter(2), 0.001);
          }
      
          @Test
          public void testCentimeterToMeter() {
              assertEquals(1, sample.centimeterToMeter(100), 0.001);
              assertEquals(2, sample.centimeterToMeter(200), 0.001);
          }
 
          // Area converter
          @Test
          public void testSquareMeterToSquareCentimeter() {
              assertEquals(10000, sample.squareMeterToSquareCentimeter(1), 0.001);
              assertEquals(20000, sample.squareMeterToSquareCentimeter(2), 0.001);
          }
      
          @Test
          public void testSquareCentimeterToSquareMeter() {
              assertEquals(1, sample.squareCentimeterToSquareMeter(10000), 0.001);
              assertEquals(2, sample.squareCentimeterToSquareMeter(20000), 0.001);
          }
        
          // Volume converter
          @Test
          public void testCubicMeterToCubicCentimeter() {
              assertEquals(1000000, sample.cubicMeterToCubicCentimeter(1), 0.001);
              assertEquals(2000000, sample.cubicMeterToCubicCentimeter(2), 0.001);
          }
      
          @Test
          public void testCubicCentimeterToCubicMeter() {
              assertEquals(1, sample.cubicCentimeterToCubicMeter(1000000), 0.001);
              assertEquals(2, sample.cubicCentimeterToCubicMeter(2000000), 0.001);
          }
             
          // Mass converter
          @Test
          public void testKilogramToGram() {
              assertEquals(1000, sample.kilogramToGram(1), 0.001);
              assertEquals(2000, sample.kilogramToGram(2), 0.001);
          }
      
          @Test
          public void testGramToKilogram() {
              assertEquals(1, sample.gramToKilogram(1000), 0.001);
              assertEquals(2, sample.gramToKilogram(2000), 0.001);
          }
 
          // Temprature converter
          @Test
            public void testCelsiusToFahrenheit() {
                assertEquals(32, sample.celsiusToFahrenheit(0), 0.001);
                assertEquals(212, sample.celsiusToFahrenheit(100), 0.001);
            }

                @Test
                public void testCelsiusToKelvin() {
                    assertEquals(273.15, sample.celsiusToKelvin(0), 0.001);
                    assertEquals(373.15, sample.celsiusToKelvin(100), 0.001);
                }

                @Test
                public void testFahrenheitToCelsius() {
                    assertEquals(0, sample.fahrenheitToCelsius(32), 0.001);
                    assertEquals(100, sample.fahrenheitToCelsius(212), 0.001);
                }

                @Test
                public void testFahrenheitToKelvin() {
                    assertEquals(273.15, sample.fahrenheitToKelvin(32), 0.001);
                    assertEquals(373.15, sample.fahrenheitToKelvin(212), 0.001);
                }

                @Test
                public void testKelvinToCelsius() {
                    assertEquals(0, sample.kelvinToCelsius(273.15), 0.001);
                    assertEquals(100, sample.kelvinToCelsius(373.15), 0.001);
                }

                @Test
                public void testKelvinToFahrenheit() {
                    assertEquals(32, sample.kelvinToFahrenheit(273.15), 0.001);
                    assertEquals(212, sample.kelvinToFahrenheit(373.15), 0.001);
                }

                // Time convereter
                @Test
                public void testSecondsToMilliseconds() {
                    assertEquals(1000, sample.secondsToMilliseconds(1), 0.001);
                    assertEquals(2000, sample.secondsToMilliseconds(2), 0.001);
                }

                @Test
                public void testSecondsToMinutes() {
                    assertEquals(1, sample.secondsToMinutes(60), 0.001);
                    assertEquals(2, sample.secondsToMinutes(120), 0.001);
                }

                @Test
                public void testMinutesToSeconds() {
                    assertEquals(60, sample.minutesToSeconds(1), 0.001);
                    assertEquals(120, sample.minutesToSeconds(2), 0.001);
                }

                @Test
                public void testHoursToMinutes() {
                    assertEquals(60, sample.hoursToMinutes(1), 0.001);
                    assertEquals(120, sample.hoursToMinutes(2), 0.001);
                }

                @Test
                public void testDaysToHours() {
                    assertEquals(24, sample.daysToHours(1), 0.001);
                    assertEquals(48, sample.daysToHours(2), 0.001);
                }

                @Test
                public void testWeeksToDays() {
                    assertEquals(7, sample.weeksToDays(1), 0.001);
                    assertEquals(14, sample.weeksToDays(2), 0.001);
                }

                @Test
                public void testYearsToDays() {
                    assertEquals(365.25, sample.yearsToDays(1), 0.001);
                    assertEquals(730.5, sample.yearsToDays(2), 0.001);
                }

                // Speed converter
                @Test
                public void testMetersPerSecondToKilometersPerHour() {
                    assertEquals(3.6, sample.metersPerSecondToKilometersPerHour(1), 0.001);
                    assertEquals(7.2, sample.metersPerSecondToKilometersPerHour(2), 0.001);
                }

                @Test
                public void testKilometersPerHourToMetersPerSecond() {
                    assertEquals(1, sample.kilometersPerHourToMetersPerSecond(3.6), 0.001);
                    assertEquals(2, sample.kilometersPerHourToMetersPerSecond(7.2), 0.001);
                }

                @Test
                public void testMilesPerHourToKilometersPerHour() {
                    assertEquals(1.60934, sample.milesPerHourToKilometersPerHour(1), 0.001);
                    assertEquals(3.21868, sample.milesPerHourToKilometersPerHour(2), 0.001);
                }

                @Test
                public void testKilometersPerHourToMilesPerHour() {
                    assertEquals(0.621371, sample.kilometersPerHourToMilesPerHour(1), 0.001);
                    assertEquals(1.242742, sample.kilometersPerHourToMilesPerHour(2), 0.001);
                }

                // Angle converter
                @Test
                public void testDegreesToRadians() {
                    assertEquals(Math.PI / 2, sample.degreesToRadians(90), 0.001);
                    assertEquals(Math.PI, sample.degreesToRadians(180), 0.001);
                }

                @Test
                public void testRadiansToDegrees() {
                    assertEquals(90, sample.radiansToDegrees(Math.PI / 2), 0.001);
                    assertEquals(180, sample.radiansToDegrees(Math.PI), 0.001);
                }




              //mean
      @Test
    public void testCalculateMean() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expectedMean = 3.0;
        double actualMean =sample.calculateMean(numbers);
        assertEquals(expectedMean, actualMean, 0.001);
    }
     
             // Absolute value
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateMeanEmptyArray() {
        int[] emptyArray = {};
        Sample.calculateMean(emptyArray);
    }

    @Test
    public void testPositiveNumber() {
        int result = Sample.absolute(5);
        assertEquals(5, result);
    }

    @Test
    public void testNegativeNumber() {
        int result = Sample.absolute(-5);
        assertEquals(5, result);
    }

    @Test
    public void testZero() {
        int result = Sample.absolute(0);
        assertEquals(0, result);
    }

       //Mode
    
    @Test
    public void testFindMode() {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        assertEquals(4, Mode.findMode(nums));
    }
    
    @Test
    public void testFindModeWithOneElement() {
        int[] nums = {5};
        assertEquals(5, Mode.findMode(nums));
    }
    
    @Test
    public void testFindModeWithMultipleModes() {
        int[] nums = {1, 1, 2, 2, 3, 3, 3};
        assertEquals(1, Mode.findMode(nums));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindModeWithEmptyArray() {
        int[] nums = {};
        Mode.findMode(nums);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindModeWithNullArray() {
        int[] nums = null;
        Mode.findMode(nums);
    }
}
