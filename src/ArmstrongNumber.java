 import java.lang.Math;
class ArmstrongNumber {
    public boolean isArmstrong(int num){
        int sum=0;
        int temp=num;
        int digits = String.valueOf(num).length();
        while(num>0){
            int lastDigit = num%10;
            sum += Math.pow(lastDigit,digits);
            num= num/10;

        }
        return sum==temp;
    }
}
