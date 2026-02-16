import java.util.*;

public class FriendsYoungestTallest {

    public static int findYoungest(int[] ages){
        int min=ages[0];
        for(int x:ages) min=Math.min(min,x);
        return min;
    }

    public static int findTallest(int[] heights){
        int max=heights[0];
        for(int x:heights) max=Math.max(max,x);
        return max;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] ages=new int[3];
        int[] heights=new int[3];

        for(int i=0;i<3;i++) ages[i]=sc.nextInt();
        for(int i=0;i<3;i++) heights[i]=sc.nextInt();

        System.out.println("Youngest age: "+findYoungest(ages));
        System.out.println("Tallest height: "+findTallest(heights));
    }
}
