import java.util.Scanner;

class TriangleArea{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is "
                + areaSqCm + " and sq in is " + areaSqIn);
    }
}
