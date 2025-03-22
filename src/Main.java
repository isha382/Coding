import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  ArmstrongNumber armstrongNumber = new ArmstrongNumber();
 boolean isarm= armstrongNumber.isArmstrong(1634);
 if(isarm==true){
     System.out.println("number is armstrong number!!!!!!");
 }
 else{
     System.out.println("not a armstrong number!!!!!!!!");
 }

 Divisors divisorobj = new Divisors();
 ArrayList<Integer> mylist = divisorobj.divisor(36);
 for(int i : mylist){
     System.out.print(i + " ");
 }


    }
}