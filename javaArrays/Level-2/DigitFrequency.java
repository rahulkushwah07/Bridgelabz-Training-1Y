import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number, count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int digits[] = new int[count];
        int freq[] = new int[10];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " = " + freq[i]);
        }
    }
}
