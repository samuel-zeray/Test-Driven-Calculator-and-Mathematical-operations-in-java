import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator sample = new Calculator();

    // Basic areas shape computation
    @Test
    public void testPerimeterOfTriangle() {
        assertEquals(8.0, sample.perimeterOftriangle(3.0, 2.0, 3.0), 0.001);
        assertEquals(9.0, sample.perimeterOftriangle(3.0, 3.0, 3.0), 0.001);
    }

    @Test
    public void testAreaOfRectangle() {
        assertEquals(3.0, sample.areaOfRectangle(3.0, 1.0), 0.001);
        assertEquals(4.0, sample.areaOfRectangle(2.0, 2.0), 0.001);
    }

    @Test
    public void testAreaOfSquare() {
        assertEquals(25.0, sample.areaOfSquare(5), 0.001);
        assertEquals(16.0, sample.areaOfSquare(4), 0.001);
    }

    @Test
    public void testAreaOfCircle() {
        assertEquals(7853.98, sample.areaOfCircle(50.0), 0.01);
        assertEquals(314.16, sample.areaOfCircle(10.0), 0.01);
    }

    // Test case of triangle function
    @Test
    public void testCalculateArea() {
        // Test case 1: Normal case
        double base = 10;
        double height = 5;
        double expectedArea = 25.0;
        double actualArea = sample.calculateArea(base, height);
        assertEquals(expectedArea, actualArea, 0.001);

        // Test case 2: Base and height are 1
        base = 1;
        height = 1;
        expectedArea = 0.5;
        actualArea = sample.calculateArea(base, height);
        assertEquals(expectedArea, actualArea, 0.001);

        // Test case 3: Base and height are large values
        base = 10000;
        height = 20000;
        expectedArea = 100000000.0;
        actualArea = sample.calculateArea(base, height);
        assertEquals(expectedArea, actualArea, 0.001);

        // Test case 4: Invalid input (negative base)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sample.calculateArea(-10, 5);
        });
        assertEquals("Base and height must be positive numbers.", exception.getMessage());

        // Test case 5: Invalid input (zero height)
        exception = assertThrows(IllegalArgumentException.class, () -> {
            sample.calculateArea(10, 0);
        });
        assertEquals("Base and height must be positive numbers.", exception.getMessage());
    }

    // Median
    @Test
    public void testCalculateMedian() {
        int[] numbers1 = {1, 2, 3, 4, 5};
        assertEquals(3.0, sample.calculateMedian(numbers1), 0.001);

        int[] numbers2 = {1, 2, 3, 4};
        assertEquals(2.5, sample.calculateMedian(numbers2), 0.001);

        int[] numbers3 = {5, 2, 1, 6, 3, 4};
        assertEquals(3.5, sample.calculateMedian(numbers3), 0.001);

        int[] numbers4 = {9};
        assertEquals(9.0, sample.calculateMedian(numbers4), 0.001);

        int[] numbers5 = {5, 2, 1, 6, 3};
        assertEquals(3.0, sample.calculateMedian(numbers5), 0.001);
    }

    // Circumference of shapes
    @Test
    public void testPerimeterRectangle() {
        assertEquals(8.0, sample.perimeterOfRectangle(3.0, 1.0), 0.001);
        assertEquals(8.0, sample.perimeterOfRectangle(2.0, 2.0), 0.001);
    }

    @Test
    public void testPerimeterSquare() {
        assertEquals(20.0, sample.perimeterOfSquare(5), 0.001);
        assertEquals(16.0, sample.perimeterOfSquare(4), 0.001);
    }

    @Test
    public void testCircumferenceCircle() {
        assertEquals(314.16, sample.circumferenceOfCircle(50.0), 0.01);
        assertEquals(62.83, sample.circumferenceOfCircle(10.0), 0.01);
    }

    // Body mass index
    @Test
    public void testBodyMassIndex() {
        assertEquals(16.33, sample.bodyMassIndex(50.0, 1.75), 0.01);
        assertEquals(30.61, sample.bodyMassIndex(60.0, 1.4), 0.01);
        assertEquals(18.37, sample.bodyMassIndex(50.0, 1.65), 0.01);
    }

    // Addition
    @Test
    public void testAddition() {
        assertEquals(10.0, sample.calculateaddition(3.0, 7.0), 0.001);
        assertEquals(4.0, sample.calculateaddition(2.0, 2.0), 0.001);
    }

    // Subtraction
    @Test
    public void testSubtraction() {
        assertEquals(3.0, sample.calculatesubtraction(10.0, 7.0), 0.001);
        assertEquals(1.0, sample.calculatesubtraction(3.0, 2.0), 0.001);
    }

    // Multiplication
    @Test
    public void testMultiplication() {
        assertEquals(8.0, sample.calculatemultiplication(2.0, 4.0), 0.001);
        assertEquals(12.0, sample.calculatemultiplication(3.0, 4.0), 0.001);
    }

    // Division with float
    @Test
    public void testDivisionWithFloat() {
        assertEquals(5.0, sample.calculatedivision(20.0, 4.0), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, sample.calculatedivision(20.0, 0.0), 0.001);
        assertEquals(0.0, sample.calculatedivision(0.0, 4.0), 0.001);
        assertEquals(2.5, sample.calculatedivision(10.0, 4.0), 0.001);
    }

    // Division with integer
    @Test
    public void testDivisionWithInteger() {
        assertEquals(5, sample.calculatedivision(5, 1));
        
        // Test case for division by zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sample.calculatedivision(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());

        assertEquals(6, sample.calculatedivision(20, 3));
    }

    // Trigonometric test cases
    @Test
    public void testSine() {
        assertEquals(0.0, sample.sine(0), 0.001);
        assertEquals(1.0, sample.sine(Math.toRadians(90)), 0.001);
        assertEquals(0.0, sample.sine(Math.toRadians(180)), 0.001);
        assertEquals(-1.0, sample.sine(Math.toRadians(270)), 0.001);
        assertEquals(0.5, sample.sine(Math.toRadians(30)), 0.001);
    }

    @Test
    public void testCosine() {
        assertEquals(1.0, sample.cosine(0), 0.001);
        assertEquals(0.0, sample.cosine(Math.toRadians(90)), 0.001);
        assertEquals(-1.0, sample.cosine(Math.toRadians(180)), 0.001);
        assertEquals(0.0, sample.cosine(Math.toRadians(270)), 0.001);
        assertEquals(0.866, sample.cosine(Math.toRadians(30)), 0.001);
    }

    @Test
    public void testTangent() {
        assertEquals(0.0, sample.tangent(0), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, sample.tangent(Math.toRadians(90)), 0.001);
        assertEquals(0.0, sample.tangent(Math.toRadians(180)), 0.001);
        assertEquals(Double.NEGATIVE_INFINITY, sample.tangent(Math.toRadians(270)), 0.001);
        assertEquals(0.577, sample.tangent(Math.toRadians(30)), 0.001);
    }

    // Factorial
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, sample.calculateFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, sample.calculateFactorial(1));
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
        assertEquals(120, sample.calculatePermutation(5, 5)); // 5! = 120
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

    // Power
    @Test
    public void testPower() {
        assertEquals(8.0, sample.power(2.0, 3.0), 0.001);
    }

    // Square Root
    @Test
    public void testSquareRoot() {
        assertEquals(2.0, sample.squareRoot(4.0), 0.001);
    }

    // Logarithm
    @Test
    public void testLogarithm() {
        assertEquals(2.0, sample.logarithm(100.0), 0.001); // log10(100) = 2
    }

    // Natural Logarithm
    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.6094379124341003, sample.naturalLogarithm(5.0), 0.0001); // ln(5) ≈ 1.609
    }

    // Inverse Trigonometric Functions
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
        assertEquals(0.5, sample.inverseSec(1 / Math.cos(0.5)), 0.0001);
    }

    @Test
    public void testInverseCot() {
        assertEquals(0.5, sample.inverseCot(1 / Math.tan(0.5)), 0.0001);
    }

    @Test
    public void testInverseCsc() {
        assertEquals(0.5, sample.inverseCsc(1 / Math.sin(0.5)), 0.0001);
    }

    // Test case of range function
    @Test
    public void testRange() {
        int[] testNumbers = {4, 5, 2, 10, 8};
        int expectedRange = 8; // 10 - 2 = 8
        int range = sample.calculateRange(testNumbers);
        assertEquals(expectedRange, range);
    }
    
    // Unit Conversion
    // Length converter
    @Test
    public void testMeterToCentimeter() {
        assertEquals(100.0, sample.meterToCentimeter(1), 0.001);
        assertEquals(200.0, sample.meterToCentimeter(2), 0.001);
    }

    @Test
    public void testCentimeterToMeter() {
        assertEquals(1.0, sample.centimeterToMeter(100), 0.001);
        assertEquals(2.0, sample.centimeterToMeter(200), 0.001);
    }

    // Area converter
    @Test
    public void testSquareMeterToSquareCentimeter() {
        assertEquals(10000.0, sample.squareMeterToSquareCentimeter(1), 0.001);
        assertEquals(20000.0, sample.squareMeterToSquareCentimeter(2), 0.001);
    }

    @Test
    public void testSquareCentimeterToSquareMeter() {
        assertEquals(1.0, sample.squareCentimeterToSquareMeter(10000), 0.001);
        assertEquals(2.0, sample.squareCentimeterToSquareMeter(20000), 0.001);
    }

    // Volume converter
    @Test
    public void testCubicMeterToCubicCentimeter() {
        assertEquals(1000000.0, sample.cubicMeterToCubicCentimeter(1), 0.001);
        assertEquals(2000000.0, sample.cubicMeterToCubicCentimeter(2), 0.001);
    }

    @Test
    public void testCubicCentimeterToCubicMeter() {
        assertEquals(1.0, sample.cubicCentimeterToCubicMeter(1000000), 0.001);
        assertEquals(2.0, sample.cubicCentimeterToCubicMeter(2000000), 0.001);
    }
             
    @Test
    public void testKilogramToGram() {
        assertEquals(1000.0, sample.kilogramToGram(1), 0.001);
        assertEquals(2000.0, sample.kilogramToGram(2), 0.001);
    }

    @Test
    public void testGramToKilogram() {
        assertEquals(1.0, sample.gramToKilogram(1000), 0.001);
        assertEquals(2.0, sample.gramToKilogram(2000), 0.001);
    }

    // Temperature converter
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, sample.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, sample.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(273.15, sample.celsiusToKelvin(0), 0.001);
        assertEquals(373.15, sample.celsiusToKelvin(100), 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, sample.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, sample.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(273.15, sample.fahrenheitToKelvin(32), 0.001);
        assertEquals(373.15, sample.fahrenheitToKelvin(212), 0.001);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, sample.kelvinToCelsius(273.15), 0.001);
        assertEquals(100.0, sample.kelvinToCelsius(373.15), 0.001);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(32.0, sample.kelvinToFahrenheit(273.15), 0.001);
        assertEquals(212.0, sample.kelvinToFahrenheit(373.15), 0.001);
    }

    // Time converter
    @Test
    public void testSecondsToMilliseconds() {
        assertEquals(1000.0, sample.secondsToMilliseconds(1), 0.001);
        assertEquals(2000.0, sample.secondsToMilliseconds(2), 0.001);
    }

    @Test
    public void testSecondsToMinutes() {
        assertEquals(1.0, sample.secondsToMinutes(60), 0.001);
        assertEquals(2.0, sample.secondsToMinutes(120), 0.001);
    }

    @Test
    public void testMinutesToSeconds() {
        assertEquals(60.0, sample.minutesToSeconds(1), 0.001);
        assertEquals(120.0, sample.minutesToSeconds(2), 0.001);
    }

    @Test
    public void testHoursToMinutes() {
        assertEquals(60.0, sample.hoursToMinutes(1), 0.001);
        assertEquals(120.0, sample.hoursToMinutes(2), 0.001);
    }

    @Test
    public void testDaysToHours() {
        assertEquals(24.0, sample.daysToHours(1), 0.001);
        assertEquals(48.0, sample.daysToHours(2), 0.001);
    }

    @Test
    public void testWeeksToDays() {
        assertEquals(7.0, sample.weeksToDays(1), 0.001);
        assertEquals(14.0, sample.weeksToDays(2), 0.001);
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

    // Mean, Remainder, Absolute value, Mode, Antilogarithm tests...

    // Mean
    @Test
    public void testCalculateMean() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expectedMean = 3.0;
        double actualMean = sample.calculateMean(numbers);
        assertEquals(expectedMean, actualMean, 0.001);
    }

    // Remainder
    @Test
    public void testCalculateRemainder() {
        assertEquals(1, sample.calculateRemainder(5, 2));
        assertEquals(0, sample.calculateRemainder(10, 2));
        assertEquals(3, sample.calculateRemainder(11, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        sample.calculateRemainder(10, 0);
    }

    // Absolute value
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateMeanEmptyArray() {
        int[] emptyArray = {};
        sample.calculateMean(emptyArray);
    }

    @Test
    public void testPositiveNumber() {
        int result = sample.absolute(5);
        assertEquals(5, result);
    }

    @Test
    public void testNegativeNumber() {
        int result = sample.absolute(-5);
        assertEquals(5, result);
    }

    @Test
    public void testZero() {
        int result = sample.absolute(0);
        assertEquals(0, result);
    }

    // Mode
    @Test
    public void testFindMode() {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        assertEquals(4, sample.findMode(nums));
    }

    @Test
    public void testFindModeWithOneElement() {
        int[] nums = {5};
        assertEquals(5, sample.findMode(nums));
    }

    @Test
    public void testFindModeWithMultipleModes() {
        int[] nums = {1, 1, 2, 2, 3, 3, 3};
        assertEquals(1, sample.findMode(nums));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindModeWithEmptyArray() {
        int[] nums = {};
        sample.findMode(nums);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindModeWithNullArray() {
        int[] nums = null;
        sample.findMode(nums);
    }

    // Antilogarithm
    @Test
    public void testCalculateAntiln() {
        assertEquals(1.0, sample.calculateAntiln(0), 0.0001);
        assertEquals(Math.E, sample.calculateAntiln(1), 0.0001);
        assertEquals(Math.exp(2), sample.calculateAntiln(2), 0.0001);
    }

    @Test
    public void testCalculateAntilog() {
        assertEquals(10.0, sample.calculateAntilog(10, 1), 0.0001);
        assertEquals(100.0, sample.calculateAntilog(10, 2), 0.0001);
        assertEquals(1000.0, sample.calculateAntilog(10, 3), 0.0001);
    }

    // Cylinder area
    @Test
    public void areaCylinder() {
        sample.areaCylinder(2, 5);
        double expected = 2 * Math.PI * 2 * (2 + 5); // 2πr(r + h)
        assertEquals(expected, sample.surfaceArea(), 0.0001);
    }

    // GCD
    @Test
    public void testGCD() {
        assertEquals(6, sample.findGCD(18, 24));
        assertEquals(5, sample.findGCD(25, 30));
        assertEquals(1, sample.findGCD(17, 23));
        assertEquals(9, sample.findGCD(27, 36));
        assertEquals(10, sample.findGCD(100, 110));
    }

    @Test
    public void testGCDWithZero() {
        assertEquals(5, sample.findGCD(5, 0));
        assertEquals(10, sample.findGCD(0, 10));
        assertEquals(0, sample.findGCD(0, 0));
    }

    @Test
    public void testGCDNegativeNumbers() {
        assertEquals(6, sample.findGCD(-18, 24));
        assertEquals(6, sample.findGCD(18, -24));
        assertEquals(6, sample.findGCD(-18, -24));
    }

    // LCM
    @Test
    public void testLCM() {
        assertEquals(72, sample.findLCM(18, 24));
        assertEquals(150, sample.findLCM(25, 30));
        assertEquals(391, sample.findLCM(17, 23));
        assertEquals(108, sample.findLCM(27, 36));
        assertEquals(1100, sample.findLCM(100, 110));
    }

    @Test
    public void testLCMWithZero() {
        assertEquals(0, sample.findLCM(5, 0));
        assertEquals(0, sample.findLCM(0, 10));
        assertEquals(0, sample.findLCM(0, 0));
    }

    @Test
    public void testLCMNegativeNumbers() {
        assertEquals(72, sample.findLCM(-18, 24));
        assertEquals(72, sample.findLCM(18, -24));
        assertEquals(72, sample.findLCM(-18, -24));
    }

    // Percentage
    @Test
    public void testCalculatePercentage() {
        assertEquals(25.0, sample.calculatePercentage(25, 100), 0.001);
        assertEquals(20.0, sample.calculatePercentage(50, 250), 0.001);
        assertEquals(40.0, sample.calculatePercentage(8, 20), 0.001);
        assertEquals(10.0, sample.calculatePercentage(10, 100), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePercentageWithZeroTotal() {
        sample.calculatePercentage(10, 0);
    }

    @Test
    public void testCalculatePercentageWithZeroNumber() {
        assertEquals(0.0, sample.calculatePercentage(0, 100), 0.001);
    }

    @Test
    public void testCalculatePercentageWithZeroBoth() {
        assertEquals(0.0, sample.calculatePercentage(0, 0), 0.001);
    }

    // Fibonacci
    @Test
    public void testCalculateNthFibonacci() {
        assertEquals(0, sample.calculateNthFibonacci(0));
        assertEquals(1, sample.calculateNthFibonacci(1));
        assertEquals(1, sample.calculateNthFibonacci(2));
        assertEquals(2, sample.calculateNthFibonacci(3));
        assertEquals(3, sample.calculateNthFibonacci(4));
        assertEquals(5, sample.calculateNthFibonacci(5));
        assertEquals(8, sample.calculateNthFibonacci(6));
        assertEquals(13, sample.calculateNthFibonacci(7));
        assertEquals(21, sample.calculateNthFibonacci(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateNthFibonacciWithNegativeInput() {
        sample.calculateNthFibonacci(-1);
    }
             
}