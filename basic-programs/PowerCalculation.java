import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = s.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = s.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
}
}
