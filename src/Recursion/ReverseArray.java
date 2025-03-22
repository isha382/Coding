package Recursion;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void reverse(int arr[]){
        int len=arr.length;
        int j=len-1;
        int i=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
    }
    public static void reverseArray(int arr[],int l, int r){
        if (l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r-1];
        arr[r-1]=temp;
        reverseArray(arr,l+1,r-1);
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
//       reverse(arr);
        reverseArray(arr,0,5);
        for(int k=0;k<5;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
