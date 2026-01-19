import java.util.Scanner;
public class CelsiusToFahrenheit {
  public static void main(String[]args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter The Celsius Value");
      int a= sc.nextInt();
      
int Fahrenheit = (a * 9/5) + 32;
      System.out.print("The Value in Fahrenheit Is = ");
      System.out.println(Fahrenheit);

  }
}