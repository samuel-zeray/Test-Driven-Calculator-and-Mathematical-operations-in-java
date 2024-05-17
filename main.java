import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    System.out.println("Enter first number:");
                    double meter = scanner.nextDouble();
                    result = calculator.meterToCentimeter(meter);
                    System.out.println("Result: " + result);
                    break;    
                case 5:
                   System.out.println("Enter first number:");
                    double squareMeter = scanner.nextDouble();
                    result = calculator.squareMeterToSquareCentimeter(squareMeter);
                    System.out.println("Result: " + result);
                    break; 
                case 6:
                   System.out.println("Enter first number:");
                    double cubicMeter = scanner.nextDouble();
                    result = calculator. cubicMeterToCubicCentimeter(cubicMeter);
                    System.out.println("Result: " + result);
                    break; 
                case 7:
                   System.out.println("Enter first number:");
                    double kilogram = scanner.nextDouble();
                    result = calculator.kilogramToGram(kilogram);
                    System.out.println("Result: " + result);
                    break; 

                case 8:
                   System.out.println("Enter first number:");
                    double celsius = scanner.nextDouble();
                    result = calculator.celsiusToFahrenheit(celsius);
                    System.out.println("Result: " + result);
                    break;
                    
                case 9:
                    System.out.println("Enter first number:");
                     double meterpersecond = scanner.nextDouble();
                     result = calculator.metersPerSecondToKilometersPerHour(meterpersecond);
                     System.out.println("Result: " + result);
                     break;                    
                case 10:
                   System.out.println("Enter first number:");
                    double second = scanner.nextDouble();
                    result = calculator.secondsToMilliseconds(second);
                    System.out.println("Result: " + result);
                    break;                     
                 case 11:
                    System.out.println("Enter first number:");
                    double degree = scanner.nextDouble();
                    result = calculator.degreesToRadians(degree);
                    System.out.println("Result: " + result);
                    break;                   
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
                       result = calculator.calculatesubtraction(n,r);
                       System.out.println("Result: " + result);
                       break;
                                 
                   case 14:
                       System.out.println("Enter first number:");
                           double num5 = scanner.nextInt();
                           double num6= scanner.nextInt();
                       result = calculator.calculatemultiplication(n,r);
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
                               result = calculator.areaOfCircle(celsius);
                               System.out.println("Result: " + result);
                           break;
                       
                   case 20:
                          System.out.println("Enter width:");
                                double widthr2 = scanner.nextDouble();
                          System.out.println("enter height:");
                               double heightr2= scanner.nextDouble();
                               result = calculator.perimeterOfRectangle(widthr,heightr);
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
                             result = calculator.circumfrenceOfcircle(celsius);
                         System.out.println("Result: " + result);
                        break;
                    case 23:
                        boolean exit = false;
                        while (!exit) {
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
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
