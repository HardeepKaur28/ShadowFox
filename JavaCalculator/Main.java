import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("\nConsole Calculator");
            System.out.println("------------------");
            operations();
            System.out.print("Enter the type of operation you want to perform: ");
            int operation = scanner.nextInt();
            clearScreen();
            
            System.out.println("Choose operation to perform:");
            switch (operation) {
                case 1 -> performArithmeticOperation(scanner);
                case 2 -> performTrigonometricOperation(scanner);
                case 3 -> performScientificOperation(scanner);
                case 4 -> performConversion(scanner);
                case 5 -> {
                    clearScreen();
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid operation. Choose 1-5.");
            }
            System.out.println("------------------");
            System.out.println("Do you want to perform another operation? (y for yes, n for no)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("n")) {
                flag = false;
                System.out.println("Exiting the calculator. Goodbye!");
            }
            clearScreen();
        }
    }

    static void operations() {
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Trigonometric Operations");
        System.out.println("3. Scientific Operations");
        System.out.println("4. Converter");
        System.out.println("5. Exit");
    }

    static void performArithmeticOperation(Scanner scanner) {
        arithmetic();
        System.out.print("Choose an arithmetic operation: ");
        int arithmeticOperation = scanner.nextInt();
        if (arithmeticOperation == 6) {
            return;
        }
        clearScreen();
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (arithmeticOperation) {
            case 1 -> {
                System.out.println("---------------------------");
                System.out.println("Addition: " + (num1 + num2));
                break;
            }
            case 2 -> {
                System.out.println("---------------------------");
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            }
            case 3 -> {
                System.out.println("---------------------------");
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            }
            case 4 -> {
                System.out.println("---------------------------");
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            }
            case 5 -> {
                System.out.println("---------------------------");
                System.out.println("Modulus: " + (num1 % num2));
                break;
            }
            case 6 -> {
                return;
            }
            default -> System.out.println("Invalid operation. Choose 1-6.");
        }
    }

    static void performTrigonometricOperation(Scanner scanner) {
        trigonometricOperation();
        System.out.print("Choose a trigonometric operation: ");
        int trigOperation = scanner.nextInt();
        if (trigOperation == 4) {
            return;
        }
        clearScreen();

        System.out.print("Enter the angle in radians: ");
        double angle = scanner.nextDouble();

        switch (trigOperation) {
            case 1 -> {
                System.out.println("---------------------------");
                System.out.println("Sine: " + Math.sin(angle));
                break;
            }
            case 2 -> {
                System.out.println("---------------------------");
                System.out.println("Cosine: " + Math.cos(angle));
                break;
            }
            case 3 -> {
                System.out.println("---------------------------");
                System.out.println("Tangent: " + Math.tan(angle));
                break;
            }
            case 4 -> {
                return;
            }
            default -> System.out.println("Invalid operation. Choose 1-4.");
        }
    }

    static void performScientificOperation(Scanner scanner) {
        scientificOperation();
        System.out.print("Choose a scientific operation: ");
        int sciOperation = scanner.nextInt();
        if (sciOperation == 7) {
            return;
        }
        clearScreen();

        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();

        switch (sciOperation) {
            case 1 -> {
                System.out.println("---------------------------");
                System.out.println("Square: " + (num * num));
                break;
            }
            case 2 -> {
                System.out.println("---------------------------");
                System.out.println("Square Root: " + Math.sqrt(num));
                break;
            }
            case 3 -> {
                System.out.println("---------------------------");
                System.out.println("Cube: " + (num * num * num));
                break;
            }
            case 4 -> {
                System.out.println("---------------------------");
                System.out.println("Cube Root: " + Math.cbrt(num));
                break;
            }
            case 5 -> {
                System.out.println("---------------------------");
                System.out.println("Exponential: " + Math.exp(num));
                break;
            }
            case 6 -> {
                System.out.println("---------------------------");
                System.out.println("Logarithm: " + Math.log(num));
                break;
            }
            case 7 -> {
                return;
            }
            default -> System.out.println("Invalid operation. Choose 1-5.");
        }
    }

    static void performConversion(Scanner scanner) {
        conversion();
        System.out.print("Choose a conversion: ");
        int conversion = scanner.nextInt();
        if (conversion == 4) {
            return;
        }
        clearScreen();

        switch (conversion) {
            case 1 -> performTemperatureConversion(scanner);
            case 2 -> performCurrencyConversion(scanner);
            case 3 -> {
                return;
            }
            default -> System.out.println("Invalid operation. Choose 1-3.");
        }
    }

    static void performTemperatureConversion(Scanner scanner) {
        temperatureOperation();
        System.out.print("Choose a temperature conversion: ");
        int tempOp = scanner.nextInt();
        if (tempOp == 3) {
            return;
        }
        clearScreen();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        switch (tempOp) {
            case 1 -> {
                System.out.println("---------------------------");
                System.out.println("Celsius to Fahrenheit: " + (temp * 9 / 5 + 32));
                break;
            }
            case 2 -> {
                System.out.println("---------------------------");
                System.out.println("Fahrenheit to Celsius: " + ((temp - 32) * 5 / 9));
                break;
            }
            case 3 -> {
                return;
            }
            default -> System.out.println("Invalid operation. Choose 1-2.");
        }
    }

    static void performCurrencyConversion(Scanner scanner) {
        currencyOperation();
        System.out.print("Choose a currency conversion: ");
        int currencyOp = scanner.nextInt();
        if (currencyOp == 3) {
            return;
        }

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        switch (currencyOp) {
            case 1 -> {
                System.out.println("---------------------------");
                System.out.println("USD to INR: " + (amount * 83.98));
                break;
            }
            case 2 -> {
                System.out.println("---------------------------");
                System.out.println("INR to USD: " + (amount / 83.98));
                break;
            }
            case 3 -> {
                return;
            }
            default -> System.out.println("Invalid operation. Choose 1-2.");
        }
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J"); // Clear the screen and the code is ANSI escape code for clearing the console 
        // ansi is a standard for controlling text formatting, color, cursor position, and other output options on video text terminals.
        System.out.flush();// Move the cursor to the top left corner
    }
    static void arithmetic() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Back to Main Menu");
    }

    static void trigonometricOperation() {
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. Back to Main Menu");
    }

    static void scientificOperation() {
        System.out.println("1. Square");
        System.out.println("2. Square Root");
        System.out.println("3. Cube");
        System.out.println("4. Cube Root");
        System.out.println("5. Exponential");
        System.out.println("6. Logarithm");
        System.out.println("7. Back to Main Menu");
    }

    static void conversion() {
        System.out.println("1. Temperature Converter");
        System.out.println("2. Currency Converter");
        System.out.println("3. Back to Main Menu");
    }

    static void currencyOperation() {
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. Back to Main Menu");
    }

    static void temperatureOperation() {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Back to Main Menu");
    }
}
