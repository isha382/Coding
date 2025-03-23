package Recursion;

public class palindromeString {

    public static boolean isPalindrome (int i,String str){

        if(i>=str.length()){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;

        return isPalindrome(i+1,str);
    }
    public static void main(String[] args) {

      boolean result=  isPalindrome(0,"MADAM");
      if (result==true){
          System.out.println("palindrome string");
      }
      else{
          System.out.println("not palindrome");
      }
    }
}
