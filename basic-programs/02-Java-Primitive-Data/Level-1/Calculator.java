import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
    }
}
