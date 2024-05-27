import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Calculator {
    //basic mathematical functions
    public double calculateaddition(double num1, double num2){
                  double summation=num1+num2;
                  return summation;
                  }
    public double calculatesubtraction(double num1, double num2){
                  double subtraction=num1-num2;
                  return subtraction;
                  }
    public double calculatemultiplication(double num1, double num2){
                  double multiplication=num1*num2;
                  return multiplication;
                  }
    public int calculatedivision(int num1, int num2){//if the nos are integer.
                 if (num2==0) {
                     throw new IllegalArgumentException("any no cann't divid by zero,otherwise undefined");
                     //if the data type of the no is float no the result will be "INFINITY".
                 }
                  int division=num1/num2;
                  return division;
                 }
    public double calculatedivision(double num1, double num2){//if the nos are float.
                 double division=num1/num2;
                 return division;
               }
               //body mass index tip
    public double bodyMassIndex(double weight,double height){
                double BMI=(weight/Math.pow(height,2));
                if (BMI<0.0){
                    throw new IllegalArgumentException("Cann't be negative");
                }
                if(BMI<18.0){
                     return -1.0;//underweight
                 }
                if(BMI>18.0||BMI<30.0){
                    return 0.0;//normal
                 }
               if(BMI>30.0){
                return 1.0;//overweight
                 }
            return BMI;
            }
   //shapes area computation
    public double areaOfRectangle(double width,double height){
               double areaR=width*height;
               return areaR;
    }
    public double areaOfSquare(double length){
        double areaS=Math.pow(length,2);
        return areaS;
    }  
    public double areaOfCircle(double radius){
        double areaC=Math.PI*Math.pow(radius, 2);
        return areaC;
    }
     // Function to calculate the area of a triangle
    public double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers.");
        }
        return (base * height) / 2;
    } 
  
  
    //cercumstance of shapes
    public double perimeterOfRectangle(double width,double height){
        double cercumstanceR=2*(width+height);
              return cercumstanceR;
         }
         public double perimeterOfSquare(double length){
          double perimeterS=4*(length);
          return perimeterS;
         }  
         public double circumfrenceOfcircle(double radius){
          double circumfrenceC=2*radius*Math.PI;
          return circumfrenceC;
         } 
         public double perimeterOftriangle(double length1,double length2,double length3) {
            double perimeterT=length1+length2+length3;
            return perimeterT;
         }
      


    //Trigonometric calculations
    public double sine(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }    
    public double cosine(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }
    public double tangent(double angleInDegrees) {
        return Math.tan(Math.toRadians(angleInDegrees));
    }
                //Median
             
                public double calculateMedian(int[] numbers) {
                    // Sort the array
                    Arrays.sort(numbers);        
                    int length = numbers.length;
                    double median;
                    if (length % 2 == 0) {
                        // If the array length is even, average the middle two numbers
                        median = (double) (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
                    } else {
                        // If the array length is odd, take the middle number
                        median = numbers[length / 2];
                    }
                    return median;
                }
                

                //Factorial
    public int calculateFactorial(int n) {
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
    public int calculatePermutation(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("Permutation is not defined for negative numbers.");
        }
        if (r > n) {
            throw new IllegalArgumentException("Value of 'r' cannot be greater than 'n'.");
        }
        return factorial(n) / factorial(n - r);
    }

            //Combination
    public int calculateCombination(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("Combination is not defined for negative numbers.");
        }
        if (r > n) {
            throw new IllegalArgumentException("Value of 'r' cannot be greater than 'n'.");
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    



    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
       

    // UNIT CONVERSION
    
                  //  Length Converter 
        public double meterToCentimeter(double meter) {
                         return meter * 100;
                   }
    
        public double centimeterToMeter(double centimeter) {
            return centimeter / 100;
        }

        // Area Converter
            public double squareMeterToSquareCentimeter(double squareMeter) {
                return squareMeter * 10000;
            }
        
            public double squareCentimeterToSquareMeter(double squareCentimeter) {
                return squareCentimeter / 10000;
            }
        
        // Volume Converter
                public double cubicMeterToCubicCentimeter(double cubicMeter) {
                    return cubicMeter * 1e6;
                }
            
                public double cubicCentimeterToCubicMeter(double cubicCentimeter) {
                    return cubicCentimeter / 1e6;
                }

        // Mass Converter
                    public double kilogramToGram(double kilogram) {
                        return kilogram * 1000;
                    }
                
                    public double gramToKilogram(double gram) {
                        return gram / 1000;
                    }

         // Temperature Converter
                        public double celsiusToFahrenheit(double celsius) {
                            return (celsius * 9 / 5) + 32;
                        }
                    
                        public double celsiusToKelvin(double celsius) {
                            return celsius + 273.15;
                        }
                    
                        public double fahrenheitToCelsius(double fahrenheit) {
                            return (fahrenheit - 32) * 5 / 9;
                        }
                    
                        public double fahrenheitToKelvin(double fahrenheit) {
                            return (fahrenheit + 459.67) * 5 / 9;
                        }
                    
                        public double kelvinToCelsius(double kelvin) {
                            return kelvin - 273.15;
                        }
                    
                        public double kelvinToFahrenheit(double kelvin) {
                            return (kelvin * 9 / 5) - 459.67;
                        }
            

         // Time Converter
                            public double secondsToMilliseconds(double seconds) {
                                return seconds * 1000;
                            }
                        
                            public double secondsToMinutes(double seconds) {
                                return seconds / 60;
                            }
                        
                            public double minutesToSeconds(double minutes) {
                                return minutes * 60;
                            }
                        
                            public double hoursToMinutes(double hours) {
                                return hours * 60;
                            }
                        
                            public double daysToHours(double days) {
                                return days * 24;
                            }
                        
                            public double weeksToDays(double weeks) {
                                return weeks * 7;
                            }
                        
                            public double yearsToDays(double years) {
                                return years * 365.25; // Allowing for leap years
                            }
                        
      
        // SpeedConverter
                                public double metersPerSecondToKilometersPerHour(double metersPerSecond) {
                                    return metersPerSecond * 3.6;
                                }
                            
                                public double kilometersPerHourToMetersPerSecond(double kilometersPerHour) {
                                    return kilometersPerHour / 3.6;
                                }
                            
                                public double milesPerHourToKilometersPerHour(double milesPerHour) {
                                    return milesPerHour * 1.60934;
                                }
                            
                                public double kilometersPerHourToMilesPerHour(double kilometersPerHour) {
                                    return kilometersPerHour / 1.60934;
                                }

        // AngleConverter
                                    public double degreesToRadians(double degrees) {
                                        return degrees * Math.PI / 180;
                                    }
                                
                                    public double radiansToDegrees(double radians) {
                                        return radians * 180 / Math.PI;
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
    
        public double inverseSin(double value) {
            return Math.asin(value);
        }
    
        public double inverseCos(double value) {
            return Math.acos(value);
        }
    
        public double inverseTan(double value) {
            return Math.atan(value);
        }
    
        public double inverseSec(double value) {
            return 1 / Math.acos(value);
        }
    
        public double inverseCot(double value) {
            return 1 / Math.atan(value);
        }
        public double inverseCsc(double value) {
            return 1 / Math.asin(value);
        }

        //function that calculates range function
        public int calculateRange(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                return 0;
            }
    
            int min = numbers[0];
            int max = numbers[0];
    
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
    
            return max - min;
        }

          // Remainder

    public int calculateRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend % divisor;
    }
    
          //mean    
    public double calculateMean(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.length;

    } 


            // Absolute value
    public int absolute(int num) {
        return num >= 0 ? num : -num;
    }

           // Mode

    public int findMode(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        // Create a frequency map to store the count of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the mode (number with highest frequency)
        int mode = nums[0];
        int maxFrequency = frequencyMap.get(nums[0]);
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > maxFrequency) {
                maxFrequency = frequencyMap.get(num);
                mode = num;
            }
        }
        
        return mode;
        }


//calculating antiln 
      public class AntilnCalculator {

      public double calculateAntiln(double value) {
        return Math.exp(value);
    }
}


          //calculating antilogarithm function 

    public double calculateAntilog(double base, double value) {
        return Math.pow(base, value); }

              // arae Cylinder 
    public double areaCylinder(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
             }

                 // GCD
    public int findGCD(int a, int b) {
        // Ensure a is greater than or equal to b
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Apply Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }   
        return a;
                         } 
            //LCM
    public int findLCM(int a, int b) {
        // Ensure a is greater than or equal to b
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // LCM is (a * b) / GCD(a, b)
        return (a / findGCD(a, b)) * b;
    }
              //percentage
    public double calculatePercentage(double number, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("Total cannot be zero");
        }

        // Calculate percentage
        return (number / total) * 100.0;
    }

        //Fiabonacci series
public int calculateNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int fibMinus1 = 1;
        int fibMinus2 = 1;
        int fib = 0;

        for (int i = 3; i <= n; i++) {
            fib = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fib;
        }
        return fib;
    }
public double circumferenceOfCircle(double d) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Unimplemented method 'circumferenceOfCircle'");
}
public double calculateAntiln(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calculateAntiln'");
}
public double surfaceArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'surfaceArea'");
} 
}//End 

    
       





