package weekend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
//        1. First approach zeros tp right
        int[] arr = {0,12,0,2,3,5,12,2,9};
        int zIndex = 0;
        for(int n:arr){
            if(n!=0){
                arr[zIndex++]=n;
            }
        }
        while(zIndex<arr.length){
            arr[zIndex++]=0;
        }
//        2. First approach zeros to left
//        int zIndex =  arr.length-1;
//        for(int i = arr.length-1;i>=0;i--){
//            if(arr[i]!=0){
//                arr[zIndex--]=arr[i];
//            }
//        }
//        while(0<=zIndex){
//            arr[zIndex--]=0;
//        }

//        System.out.println(Arrays.toString(arr));

//        2. Shift the array to right to even numbers
        int[] nums = {24,23,0,8,5,12,0};
        int index = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]!=0){
                int temp = nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                index--;
            }
        }
        System.out.println(Arrays.toString(nums));
        String[] str = {"Raju","Kiran","Kiran","Mohan","Deva","Kiran","Deva"};
        String hiString = "";
        long hiVal = 0;
        String hiOcc =   Arrays.stream(str)
                .collect(Collectors.toMap(Function.identity(),i->i.length(),(a,b)->a, LinkedHashMap::new)).
        entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null).getKey();
//        System.out.println(hiOcc);

        HashMap<String,Integer> newMap = new HashMap<>();
        for(String s : str){
            newMap.put(s,newMap.getOrDefault(s,0)+1);
        }
        String highestOcc = "";
        int num = 0;

        for(Map.Entry<String,Integer> entry:newMap.entrySet()){
            if(entry.getValue()>num){
                num = entry.getValue();
                highestOcc = entry.getKey();
            }
        }
        System.out.println("Here highest occurrence of String "+highestOcc +":"+ + num +" time");
     String s= newMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null).getKey();
        System.out.println(s+"---"+newMap);

    }
}
