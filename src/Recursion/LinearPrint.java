package Recursion;

public class LinearPrint {
    public static void linearPrint(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+ " ");
        linearPrint(i+1,n);
    }
    public static void reverseLinearPrint(int i,int n){
        if(i<1){
            return;
        }
        System.out.println();
        System.out.print(i+ " ") ;
        reverseLinearPrint(i-1,n);
    }
    public static void main(String [] args){
        int n= 10;
        linearPrint(1,10);
        reverseLinearPrint(10,10);
    }
}
