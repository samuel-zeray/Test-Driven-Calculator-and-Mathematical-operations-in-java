import java.util.Scanner;

public class main {
    public static void main(String []args) {
         Calculator calculator = new Calculator();
         Scanner scanner = new Scanner(System.in);

         System.out.println("Welcome to the Calculator App!");

           while (true) {
            System.out.println("Select operation:");

            System.out.println("1. Factorial");
            System.out.println("2. Permutation");
            System.out.println("3. Combination");
            System.out.println("4. Length Converter");
            System.out.println("5. Area Converter");
            System.out.println("6. Volume Converter");
            System.out.println("7. Mass Converter");
            System.out.println("8. Temprature Converter");
            System.out.println("9. Time Converter");
            System.out.println("10. Speed Converter");
            System.out.println("11. Angle Converter");
               //mati's functions chioce
            System.out.println("12. addition");
            System.out.println("13. subtraction");
            System.out.println("14. multiplication");
            System.out.println("15. division");
            System.out.println("16. body mass index");
            System.out.println("17. rectangle area");
            System.out.println("18. square area");
            System.out.println("19. circle area");
            System.out.println("20. perimeter of rectangle");
            System.out.println("21. perimeter of square");
            System.out.println("22. circumference of circle");
          //semere's functions chioce
            System.out.println("23. Trigonometric");
            System.out.println("24. Median");
            System.out.println("25. Area of Triangle");
          //mati's functions chioce
            System.out.println("26. perimeter of tringle");
         //area cylinder 
            System.out.println("27.area of cylinder");

            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Calculator App. Goodbye!");
                break;
            }

            double result;
            switch (choice) {
                case 1:
                 System.out.println("Enter the number:");
                 int n = scanner.nextInt();
                    result = calculator.calculateFactorial(n);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                     System.out.println("Enter first number:");
                        n = scanner.nextInt();
                        System.out.println("Enter second number:");
                        int r = scanner.nextInt();
                    result = calculator.calculatePermutation(n,r);
                    System.out.println("Result: " + result);
                    break;
               
                case 3:
                     System.out.println("Enter first number:");
                        n = scanner.nextInt();
                        System.out.println("Enter second number:");
                        r = scanner.nextInt();
                    result = calculator.calculateCombination(n,r);
                    System.out.println("Result: " + result);
                    break;
                case 4:

                             boolean exit = false;
                        while (!exit) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert Meter to Centimeter");
                            System.out.println("2. convert centimeter to Meter");
                            System.out.println("3. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in Meter:");
                                            double meter = scanner.nextDouble();
                                            result = calculator.meterToCentimeter(meter);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in centimeter:");
                                            double centimeter = scanner.nextDouble();
                                            result = calculator.centimeterToMeter(centimeter);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                    exit = true;
                                     break;
                                    default:
                                  System.out.println("Invalid choice. Please select again.");
                                                }
                                                System.out.println();
                                                break;    
                                            }
                  
                case 5:

                              boolean exits = false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert squareMeter to SquareCentimeter");
                            System.out.println("2. convert SquareCentimeter to squareMeter");
                            System.out.println("3. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in squareMeter:");
                                            double squareMeter = scanner.nextDouble();
                                            result = calculator.squareMeterToSquareCentimeter(squareMeter);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in Square Centimeter:");
                                            double SquareCentimeter = scanner.nextDouble();
                                            result = calculator.squareCentimeterToSquareMeter(SquareCentimeter);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }
                case 6:            
                exits =false;  
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert cubicMeter to CubicCentimeter");
                            System.out.println("2. convert CubicCentimeter to cubicMeter");
                            System.out.println("3. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in cubicMeter:");
                                            double cubicMeter = scanner.nextDouble();
                                            result = calculator.cubicMeterToCubicCentimeter(cubicMeter);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in Cubic Centimeter:");
                                            double CubicCentimeter = scanner.nextDouble();
                                            result = calculator.cubicCentimeterToCubicMeter(CubicCentimeter);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }
                case 7:
                exits =false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert kilogram to gram");
                            System.out.println("2. convert gram to kilogram");
                            System.out.println("3. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in kilogram:");
                                            double kilogram = scanner.nextDouble();
                                            result = calculator.kilogramToGram(kilogram);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in gram:");
                                            double gram = scanner.nextDouble();
                                            result = calculator.gramToKilogram(gram);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }

                case 8:
                      exits =false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert celsius to Fahrenheit");
                            System.out.println("2. convert celsius to kelvin");
                            System.out.println("3. convert Fahrenheit to celsius");
                            System.out.println("4. convert Fahrenheit to kelvin");
                            System.out.println("5. convert kelvin to celsius");
                            System.out.println("6. convert kelvin to Fahrenheit");
                            System.out.println("0. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in celsius:");
                                            double celsius = scanner.nextDouble();
                                            result = calculator.celsiusToFahrenheit(celsius);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in celsius:");
                                            double cel = scanner.nextDouble();
                                            result = calculator.celsiusToKelvin(cel);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                       System.out.println("Enter number in fahrenheit:");
                                            double fahrenheit = scanner.nextDouble();
                                            result = calculator.fahrenheitToCelsius(fahrenheit);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 4:
                                       System.out.println("Enter number in fahrenheit:");
                                            double fahrenheits = scanner.nextDouble();
                                            result = calculator.fahrenheitToKelvin(fahrenheits);
                                            System.out.println("Result: " + result);
                                            break;
                                case 5:
                                       System.out.println("Enter number in kelvin:");
                                            double kelvin = scanner.nextDouble();
                                            result = calculator.kelvinToCelsius(kelvin);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 6:
                                       System.out.println("Enter number in kelvin:");
                                            double kelvins = scanner.nextDouble();
                                            result = calculator.kelvinToFahrenheit(kelvins);
                                            System.out.println("Result: " + result);
                                            break;
                                case 0:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }
                  
                   System.out.println("Enter first number:");
                    double celsius = scanner.nextDouble();
                    result = calculator.celsiusToFahrenheit(celsius);
                    System.out.println("Result: " + result);
                    break;
                    
                case 9:
                exits= false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert second to millisecond");
                            System.out.println("2. convert seconds to Minutes");
                            System.out.println("3. convert minutes to Seconds");
                            System.out.println("4. convert hours to Minutes");
                            System.out.println("5. convert days to Hours");
                            System.out.println("6. convert weeks to Days");
                            System.out.println("7. convert years to Days");
                            System.out.println("0. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in second:");
                                            double second = scanner.nextDouble();
                                            result = calculator.secondsToMilliseconds(second);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in second:");
                                            double seconds = scanner.nextDouble();
                                            result = calculator.secondsToMinutes(seconds);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                       System.out.println("Enter number in minute:");
                                            double minute = scanner.nextDouble();
                                            result = calculator.minutesToSeconds(minute);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 4:
                                       System.out.println("Enter number in hour:");
                                            double hour = scanner.nextDouble();
                                            result = calculator.hoursToMinutes(hour);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 5:
                                       System.out.println("Enter number in day:");
                                            double day = scanner.nextDouble();
                                            result = calculator.daysToHours(day);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 6:
                                       System.out.println("Enter number in week:");
                                            double week = scanner.nextDouble();
                                            result = calculator.weeksToDays(week);
                                            System.out.println("Result: " + result);
                                            break;
                                case 7:
                                       System.out.println("Enter number in year:");
                                            double year = scanner.nextDouble();
                                            result = calculator.yearsToDays(year);
                                            System.out.println("Result: " + result);
                                            break;                                
                              
                                case 0:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }
                                   
                case 10:
                exits= false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert metersPerSecond to KilometersPerHour");
                            System.out.println("2. convert kilometersPerHour to MetersPerSecond");
                            System.out.println("3. convert milesPerHour to KilometersPerHour");
                            System.out.println("4. convert kilometersPerHour to MilesPerHour");
                            System.out.println("0. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in meter per second:");
                                            double mPerSec = scanner.nextDouble();
                                            result = calculator.metersPerSecondToKilometersPerHour(mPerSec);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in km/h:");
                                            double kmPerH = scanner.nextDouble();
                                            result = calculator.kilometersPerHourToMetersPerSecond(kmPerH);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                       System.out.println("Enter number in miles/h:");
                                            double milesPerHour = scanner.nextDouble();
                                            result = calculator.milesPerHourToKilometersPerHour(milesPerHour);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 4:
                                       System.out.println("Enter number in km/h:");
                                            double kmPerHour = scanner.nextDouble();
                                            result = calculator.kilometersPerHourToMilesPerHour(kmPerHour);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 0:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }           
                 case 11:
                           exits= false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. convert degrees to Radians");
                            System.out.println("2. convert radians to Degrees");
                            System.out.println("3. Exit");
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                        System.out.println("Enter number in degree:");
                                            double degree = scanner.nextDouble();
                                            result = calculator.degreesToRadians(degree);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 2:
                                       System.out.println("Enter number in radian:");
                                            double radian = scanner.nextDouble();
                                            result = calculator.radiansToDegrees(radian);
                                            System.out.println("Result: " + result);
                                            break; 
                                case 3:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }
                                    
                                    
                  case 12:
                    System.out.println("Enter the number:");
                         double num1 = scanner.nextInt();
                         double num2 = scanner.nextInt();
                       result = calculator.calculateaddition( num1,num2);
                       System.out.println("Result: " + result);
                       break;
                   case 13:
                      System.out.println("Enter first number:");
                           double num3 = scanner.nextInt();
                           double num4 = scanner.nextInt();
                       result = calculator.calculatesubtraction(num3,num4);
                       System.out.println("Result: " + result);
                       break;
                                 
                   case 14:
                       System.out.println("Enter first number:");
                           double num5 = scanner.nextInt();
                           double num6= scanner.nextInt();
                       result = calculator.calculatemultiplication(num5,num6);
                       System.out.println("Result: " + result);
                       break;
                   case 15:
                       System.out.println("Enter first number:");
                          double num7 = scanner.nextInt();
                          double num8 = scanner.nextInt();
                       result = calculator.calculatedivision(num7,num8);
                       System.out.println("Result: " + result);
                       break;    
                   case 16:
                      System.out.println("enter your weight:");
                          double weight = scanner.nextDouble();
                      System.out.println("enter your height:");
                          double height = scanner.nextDouble();
                       result = calculator.bodyMassIndex(weight,height);
                       System.out.println("Result: " + result);
                       break; 
                   case 17:
                      System.out.println("Enter width:");
                           double widthr = scanner.nextDouble();
                      System.out.println("enter height:");
                           double heightr= scanner.nextDouble();
                           result = calculator. areaOfRectangle(widthr,heightr);
                           System.out.println("Result: " + result);
                       break; 
                   case 18:
                      System.out.println("Enter length:");
                           double length = scanner.nextDouble();
                           result = calculator.areaOfSquare(length);
                           System.out.println("Result: " + result);
                       break; 
                   case 19:
                          System.out.println("Enter radius:");
                               double radius = scanner.nextDouble();
                               result = calculator.areaOfCircle(radius);
                               System.out.println("Result: " + result);
                           break;
                       
                   case 20:
                          System.out.println("Enter width:");
                                double widthr2 = scanner.nextDouble();
                          System.out.println("enter height:");
                               double heightr2= scanner.nextDouble();
                               result = calculator.perimeterOfRectangle(widthr2,heightr2);
                          System.out.println("Result: " + result);
                      break;   
                   case 21:
                         System.out.println("Enter length:");
                            double lengthS = scanner.nextDouble();
                            result = calculator.perimeterOfSquare(lengthS);
                         System.out.println("Result: " + result);
                        break; 
                    case 22:
                         System.out.println("Enter radius:");
                             double radiusC = scanner.nextDouble();
                             result = calculator.circumfrenceOfcircle(radiusC);
                         System.out.println("Result: " + result);
                        break;
                    case 23:
                         exits=false;
                        while (!exits) {
                            System.out.println("Select an option:");
                            System.out.println("1. Calculate Sine");
                            System.out.println("2. Calculate Cosine");
                            System.out.println("3. Calculate Tangent");
                            System.out.println("4. Exit");
                            int choose = scanner.nextInt();

                            switch (choose) {
                                case 1:
                                    System.out.print("Enter angle in degrees: ");
                                    double angleSin = scanner.nextDouble();
                                    System.out.println("Sine of " + angleSin + " degrees: " + Math.sin(Math.toRadians(angleSin)));
                                    break;
                                case 2:
                                    System.out.print("Enter angle in degrees: ");
                                    double angleCos = scanner.nextDouble();
                                    System.out.println("Cosine of " + angleCos + " degrees: " + Math.cos(Math.toRadians(angleCos)));
                                    break;
                                case 3:
                                    System.out.print("Enter angle in degrees: ");
                                    double angleTan = scanner.nextDouble();
                                    System.out.println("Tangent of " + angleTan + " degrees: " + Math.tan(Math.toRadians(angleTan)));
                                    break;
                                case 4:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please select again.");
                            }
                            System.out.println();
                            break;    
                        }
                    case 24:
                          // Prompt user to enter the number of elements
                          System.out.print("Enter the number of elements: ");
                          int num = scanner.nextInt();

                          // Create an array to hold the user's numbers
                          double[] numbers = new double[num];

                          // Prompt user to enter each number
                          System.out.println("Enter the numbers:");
                          for (int i = 0; i < num; i++) {
                              numbers[i] = scanner.nextDouble();
                          }

                          // Calculate and print the median
                          double median = calculateMedian(numbers);
                          System.out.println("Median of the entered numbers: " + median);
                          break;
                    case 25:
                           // Prompt user to enter the sides of the triangle
                          System.out.print("Enter the length of the first side: ");
                          double side1 = scanner.nextDouble();

                          System.out.print("Enter the length of the second side: ");
                          double side2 = scanner.nextDouble();

                          System.out.print("Enter the length of the third side: ");
                          double side3 = scanner.nextDouble();

                          // Calculate the area of the triangle
                          double area = calculateArea(side1, side2, side3);

                          // Display the result
                          System.out.println("The area of the triangle is: " + area);
                          break; 
                    case 26:
                         // Prompt user to enter the sides of the triangle
                        System.out.print("Enter the length of the first side: ");
                        double length1 = scanner.nextDouble();

                        System.out.print("Enter the length of the second side: ");
                        double length2= scanner.nextDouble();

                        System.out.print("Enter the length of the third side: ");
                        double length3 = scanner.nextDouble();

                        // Calculate the perimeter of the triangle
                        double perimeter = perimeterOftriangle(length1, length2, length3);

                        // Display the result
                        System.out.println("The perimeter of the triangle is: " + perimeter);
                        break; 


                             //prompt the user enter the radius and height of cylinder 
                    case 27:
                                System.out.println("enter the radius");
                                        double radiuses=scanner.nextDouble();
                                System.out.println("enter the height");
                                    double heights=scanner.nextDouble();
                                    //calculate surface area cylinder 
                                        double areas = areaCylinder (heights, radiuses);
                                System.out.println("the area of cylinder is"+areas);
                                            break;

                   default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    private static double areaCylinder(double height, double radius) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'areaCylinder'");
    }

    private static double perimeterOftriangle(double length1, double length2, double length3) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeterOftriangle'");
    }

    private static double calculateArea(double side1, double side2, double side3) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }

    private static double calculateMedian(double[] numbers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateMedian'");
    }
}
