import java.util.Scanner;
class SimpleInterest{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Principal:"  );
	double p=s.nextDouble();
	System.out.println("Enter Rate:"  );
	double r=s.nextDouble();
	System.out.println("Enter Time:"  );
	double t =s.nextDouble();
double si=(p*r*t)/100;

System.out.println("Simple Interest:=" +si); }}
