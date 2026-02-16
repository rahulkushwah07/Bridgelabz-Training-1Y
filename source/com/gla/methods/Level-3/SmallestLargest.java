import java.util.Scanner;
public class SmallestLargest {
    public static int[] find(int a,int b,int c){
        int small=Math.min(a,Math.min(b,c));
        int large=Math.max(a,Math.max(b,c));
        return new int[]{small,large};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int[] r=find(a,b,c);
        System.out.println("Smallest: "+r[0]);
        System.out.println("Largest: "+r[1]);
    }
}