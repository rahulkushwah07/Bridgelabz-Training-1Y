import java.util.Scanner;
public class TriangularRun {
    public static double rounds(double a,double b,double c){
        return 5000/(a+b+c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        System.out.println("Rounds: "+rounds(a,b,c));
    }
}