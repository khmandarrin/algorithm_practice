import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        if (arr.length==1) return new int[]{-1};
        
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]) min = arr[i]; 
        }
        
        for(int num : arr){
            if(num != min){
                list.add(num);}
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}