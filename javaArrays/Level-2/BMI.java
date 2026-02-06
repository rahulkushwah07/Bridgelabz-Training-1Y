import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double h[] = new double[n];
        double w[] = new double[n];
        double bmi[] = new double[n];
        String s[] = new String[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextDouble();
            w[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);

            if (bmi[i] <= 18.4) s[i] = "Underweight";
            else if (bmi[i] <= 24.9) s[i] = "Normal";
            else if (bmi[i] <= 39.9) s[i] = "Overweight";
            else s[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(h[i] + " " + w[i] + " " + bmi[i] + " " + s[i]);
        }
    }
}
