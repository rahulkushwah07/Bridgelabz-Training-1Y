import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        int ageB = sc.nextInt();
        int ageC = sc.nextInt();

        int heightA = sc.nextInt();
        int heightB = sc.nextInt();
        int heightC = sc.nextInt();

        int youngest = Math.min(ageA, Math.min(ageB, ageC));
        int tallest = Math.max(heightA, Math.max(heightB, heightC));

        System.out.println("Youngest age = " + youngest);
        System.out.println("Tallest height = " + tallest);
    }
}
