package Recursion;

import java.util.Scanner;

public class StackoverflowError {
    public static void f(int n){
        if(n==0){
            return;
        }
        System.out.println("isha");
        f(n-1);
    }
    public static void main(String [ ] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        f(n);
    }
}