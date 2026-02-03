package com.gla.arrays;

class GreatestElement {
  public static void main(String[] args) {
        int arr[]={5,7,3,9,1,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
      System.out.println("Max Element is: "+max);
    }
}
