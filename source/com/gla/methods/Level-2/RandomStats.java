import java.util.*;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int x:numbers){
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        double avg=(double)sum/numbers.length;
        return new double[]{avg,min,max};
    }

    public static void main(String[] args){
        int[] arr=generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findAverageMinMax(arr)));
    }
}
