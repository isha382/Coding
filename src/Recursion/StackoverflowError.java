package Recursion;

public class StackoverflowError {
    public static void f(){
        System.out.println("isha");
        f();
    }
    public static void main(String [ ] args){
        f();
    }
}