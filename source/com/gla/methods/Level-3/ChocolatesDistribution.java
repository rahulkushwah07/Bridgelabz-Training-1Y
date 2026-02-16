import java.util.Scanner;
public class ChocolatesDistribution {
    public static int[] calc(int c,int ch){
        return new int[]{c/ch,c%ch};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt(),ch=sc.nextInt();
        int[] r=calc(c,ch);
        System.out.println("Each child gets: "+r[0]);
        System.out.println("Remaining: "+r[1]);
    }
}