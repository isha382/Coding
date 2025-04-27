import java.util.*;
public class countFrequency {
    public static void main(String[] args) {
        int arr[] = {10,20,10,30,40,20};
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) +1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for( Map.Entry<Integer,Integer>ele : map.entrySet()){
            System.out.println("key " + ele.getKey());
            System.out.println("value " + ele.getValue());
        }
        Scanner sc = new Scanner(System.in);
       int q=sc.nextInt();

        while(q-- > 0){
        int num=sc.nextInt();
        if(map.containsKey(num)) System.out.println(map.get(num));
        else  {
            System.out.println(0);
        }
        }
    }
}
