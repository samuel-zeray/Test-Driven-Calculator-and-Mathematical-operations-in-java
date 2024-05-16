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
            System.out.println("23. perimeter of tringle");

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
                    result = calculator.  secondsToMilliseconds(second);
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
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
