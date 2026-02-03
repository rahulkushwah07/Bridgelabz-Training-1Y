package com.gla.arrays;
import java.util.Scanner;

public class ArrayTraversal {
    static void main() {
        Scanner sr=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sr.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

}