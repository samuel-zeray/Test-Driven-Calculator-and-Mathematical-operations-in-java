public class Calculator {
    public static double calculateaddition(double num1, double num2){
                  double summation=num1+num2;
                  return summation;
                  }
    public static double calculatesubtraction(double num1, double num2){
                  double subtraction=num1-num2;
                  return subtraction;
                  }
    public static double calculatemultiplication(double num1, double num2){
                  double multiplication=num1*num2;
                  return multiplication;
                  }
    public static int calculatedivision(int num1, int num2){//if the nos are integer.
                 if (num2==0) {
                     throw new IllegalArgumentException("any no cann't divid by zero,otherwise undefined");
                     //if the data type of the no is float no the result will be "INFINITY".
                 }
                  double division=num1/num2;
                  return division;
                 }
    public static double calculatedivision(double num1, double num2){//if the nos are float.
                 double division=num1/num2;
                 return division;
               }
    
    //Trigonometric calculations
    public class TrigonometricFunctions {
        public static double sine(double angleInDegrees) {
            return Math.sin(Math.toRadians(angleInDegrees));
        }    
        public static double cosine(double angleInDegrees) {
            return Math.cos(Math.toRadians(angleInDegrees));
        }
        public static double tangent(double angleInDegrees) {
            return Math.tan(Math.toRadians(angleInDegrees));
        }
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
       

    // UNIT CONVERSION
    
                  //  Length Converter 
        public static double meterToCentimeter(double meter) {
                         return meter * 100;
                   }
    
        public static double centimeterToMeter(double centimeter) {
            return centimeter / 100;
        }

        // Area Converter
            public static double squareMeterToSquareCentimeter(double squareMeter) {
                return squareMeter * 10000;
            }
        
            public static double squareCentimeterToSquareMeter(double squareCentimeter) {
                return squareCentimeter / 10000;
            }
        
        // Volume Converter
                public static double cubicMeterToCubicCentimeter(double cubicMeter) {
                    return cubicMeter * 1e6;
                }
            
                public static double cubicCentimeterToCubicMeter(double cubicCentimeter) {
                    return cubicCentimeter / 1e6;
                }

        // Mass Converter
                    public static double kilogramToGram(double kilogram) {
                        return kilogram * 1000;
                    }
                
                    public static double gramToKilogram(double gram) {
                        return gram / 1000;
                    }

         // Temperature Converter
                        public static double celsiusToFahrenheit(double celsius) {
                            return (celsius * 9 / 5) + 32;
                        }
                    
                        public static double celsiusToKelvin(double celsius) {
                            return celsius + 273.15;
                        }
                    
                        public static double fahrenheitToCelsius(double fahrenheit) {
                            return (fahrenheit - 32) * 5 / 9;
                        }
                    
                        public static double fahrenheitToKelvin(double fahrenheit) {
                            return (fahrenheit + 459.67) * 5 / 9;
                        }
                    
                        public static double kelvinToCelsius(double kelvin) {
                            return kelvin - 273.15;
                        }
                    
                        public static double kelvinToFahrenheit(double kelvin) {
                            return (kelvin * 9 / 5) - 459.67;
                        }
            

         // Time Converter
                            public static double secondsToMilliseconds(double seconds) {
                                return seconds * 1000;
                            }
                        
                            public static double secondsToMinutes(double seconds) {
                                return seconds / 60;
                            }
                        
                            public static double minutesToSeconds(double minutes) {
                                return minutes * 60;
                            }
                        
                            public static double hoursToMinutes(double hours) {
                                return hours * 60;
                            }
                        
                            public static double daysToHours(double days) {
                                return days * 24;
                            }
                        
                            public static double weeksToDays(double weeks) {
                                return weeks * 7;
                            }
                        
                            public static double yearsToDays(double years) {
                                return years * 365.25; // Allowing for leap years
                            }
                        
      
        // SpeedConverter
                                public static double metersPerSecondToKilometersPerHour(double metersPerSecond) {
                                    return metersPerSecond * 3.6;
                                }
                            
                                public static double kilometersPerHourToMetersPerSecond(double kilometersPerHour) {
                                    return kilometersPerHour / 3.6;
                                }
                            
                                public static double milesPerHourToKilometersPerHour(double milesPerHour) {
                                    return milesPerHour * 1.60934;
                                }
                            
                                public static double kilometersPerHourToMilesPerHour(double kilometersPerHour) {
                                    return kilometersPerHour / 1.60934;
                                }

        // AngleConverter
                                    public static double degreesToRadians(double degrees) {
                                        return degrees * Math.PI / 180;
                                    }
                                
                                    public static double radiansToDegrees(double radians) {
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
    
       





