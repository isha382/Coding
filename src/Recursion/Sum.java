package Recursion;
//to find sum of n numbers
public class Sum {
    public static void findSumParametrised( int i,int sum){
    if(i<1){
        System.out.println(sum);
        return;
    }
        findSumParametrised(i-1,sum+i);

    }
    public static int findSumFunctional(int n){
        if(n<1){
            return 0;
        }
    return   n +  findSumFunctional(n-1);
    }

    public static void main(String [] args){
        findSumParametrised(5,0);
        System.out.println(findSumFunctional(5));
    }
}
