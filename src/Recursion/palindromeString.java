package Recursion;

public class palindromeString {

    public static boolean isPalindrome (int i,String str){

        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;

        return isPalindrome(i+1,str);
    }

    public static boolean isPalindromePhrase(String s) {
        int left=0;
        int right=s.length()-1;
        if(s.isEmpty()){
            return true;   ///empty string is always  palindome
        }
        while(left<right){
            char leftChar= s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            else {
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false ;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {

      boolean result=  isPalindrome(0,"A man, a plan, a canal: Panama");
        boolean Phraseresult=   isPalindromePhrase("A man, a plan, a canal: Panama");
      if (result==true){
          System.out.println("palindrome string");
      }
      else{
          System.out.println("not palindrome");
      }

        if (Phraseresult==true){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
