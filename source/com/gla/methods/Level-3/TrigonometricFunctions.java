import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calc(double angle){
        double r=Math.toRadians(angle);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double[] r=calc(a);
        System.out.println("Sin: "+r[0]);
        System.out.println("Cos: "+r[1]);
        System.out.println("Tan: "+r[2]);
    }
}