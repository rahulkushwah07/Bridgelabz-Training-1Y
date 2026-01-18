import java.util.Scanner;
public class Areaofcircle {
  public static void main(String[]args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter The Value of Radius");
      int a= sc.nextInt();
      
double area = 3.14*a*a;
      System.out.print("The Area of Circle Is = ");
      System.out.println(area);

  }
}