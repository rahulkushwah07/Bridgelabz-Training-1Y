import java.util.Scanner;
 class KiloToMiles {
  public static void main(String[]args) {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter Kilometer");
      int k= sc.nextInt();
      
double Miles =k*0.621371;
      System.out.print("The Value in Miles Is = ");
      System.out.println(Miles);

  }
}