
public class Calculator {
    public static int calculateaddition(int num1,num2){
        int summation=num1+num2;
        return summation;
    }
    public static int calculatesubtraction(int num1,num2){
    int subtraction=num1-num2;
    return subtraction;
    }
    public static int calculatemultiplication(int num1,num2){
    int multiplication=num1*num2;
    return multiplication;
    }
    public static int calculatedivision(int num1,num2){
    int division=num1/num2;
    return division;  
     }
    
    
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

        //Inverse of Trignometric functions 
    

    public static double inverseSin(double value) {
        return Math.asin(value);
    }

    public static double inverseCos(double value) {
        return Math.acos(value);
    }

    public static double inverseTan(double value) {
        return Math.atan(value);
    }

    public static double inverseSec(double value) {
        return 1 / Math.acos(value);
    }

    public static double inverseCot(double value) {
        return 1 / Math.atan(value);
    }

    public static double inverseCsc(double value) {
        return 1 / Math.asin(value);
    }

}

