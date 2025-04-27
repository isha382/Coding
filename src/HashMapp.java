import java.util.*;
//basics of hashmap
public class HashMapp {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(1,1120);
        map.put(2,3210);
        map.put(3,45678);
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            System.out.println("key is "+ ele.getKey());
            System.out.println("value is " + ele.getValue());
        }
    }
}
