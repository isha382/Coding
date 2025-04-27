import java.util.*;
public class MinMaxFrequency {
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
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int minEle = -1;
        int maxEle =-1;
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            int element = ele.getKey();
            int frequency = ele.getValue();
            if(frequency > maxFreq){
                maxFreq=frequency;
                maxEle = element;
            }
            if(frequency < minFreq){
                minFreq=frequency;
                minEle = element;
            }

        }

        System.out.println("Element with Highest Frequency: " + maxEle + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with Lowest Frequency: " + minEle + " (Frequency: " + minFreq + ")");






    }
}
