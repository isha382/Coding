package Recursion;

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
        for(int k=0;k<len;k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
        reverse(arr);
    }
}
