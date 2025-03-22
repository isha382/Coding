import java.util.*;
public class Divisors
{
    public ArrayList divisor(int num){

    ArrayList<Integer> mylist = new ArrayList<>();
    for(int i=1;i<=Math.sqrt(num);i++){
          if(num%i==0){
              mylist.add(i);
              if(num/i!=i){
                  mylist.add(num/i);
              }
          }
    }
    mylist.sort(null);
        return mylist;
    }
}
