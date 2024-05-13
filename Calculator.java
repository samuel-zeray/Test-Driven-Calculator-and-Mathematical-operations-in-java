i it
public class Calculator {
    
                //Factorial
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


              //Permutation
    public static int calculatePermutation(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("Permutation is not defined for negative numbers.");
        }
        if (r > n) {
            throw new IllegalArgumentException("Value of 'r' cannot be greater than 'n'.");
        }
        return factorial(n) / factorial(n - r);
    }

            //Combination
    public static int calculateCombination(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("Combination is not defined for negative numbers.");
        }
        if (r > n) {
            throw new IllegalArgumentException("Value of 'r' cannot be greater than 'n'.");
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    



    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


           //Power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }


           //squarRoot
  public double squareRoot(double value) {
        return Math.sqrt(value);
    }


            //logarithm
    public double logarithm(double value) {
        return Math.log10(value);
    }


         //natural logarithm
    public double naturalLogarithm(double value) {
        return Math.log(value);
    }

}

