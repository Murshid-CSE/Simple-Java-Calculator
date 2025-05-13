import java.util.Scanner;

public class MyCalculator {
    static double add(double x, double y) {
        return x + y;
    }
    static double subtract(double x, double y) {
        return x - y;
    }
    static double multiply(double x, double y) {
        return x * y;
    }
    static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero.");
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again = 'y';

        do {
            System.out.print("Enter first number: ");
            double a = input.nextDouble();

            System.out.print("Enter operator (+ - * /): ");
            char op = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = input.nextDouble();

            double res = 0;

            switch (op) {
                case '+':
                    res = add(a, b);
                    break;
                case '-':
                    res = subtract(a, b);
                    break;
                case '*':
                    res = multiply(a, b);
                    break;
                case '/':
                    res = divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            System.out.println("Answer = " + res);

            System.out.print("Do you want to continue? (yes/no): ");
            again = input.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Thank you for using murshid calculator.");
        input.close();
    }
}