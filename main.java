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
           

            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting Calculator App. Goodbye!");
                break;
            }

            int result;
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
                  
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
