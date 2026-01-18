import java.util.Scanner;
class VolumeOfCylinder{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("The Radius is:"  );
	int r=s.nextInt();
	System.out.println("The Height is:"  );
	int h=s.nextInt();
double v=3.14*r*r*h;

System.out.println("The volume of cylinder is:" +v); }}
