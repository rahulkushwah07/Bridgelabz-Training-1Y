import java.util.Scanner;
public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int temp=n,rev=0;
        while(temp!=0){ rev=rev*10+temp%10; temp/=10; }
        return rev==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n)?"Palindrome":"Not Palindrome");
    }
}