import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for (String[] cloth: clothes){
            hashMap.put(cloth[1], hashMap.getOrDefault(cloth[1], 0)+1);
        }
        
        for (int value: hashMap.values()){
            answer *= (value+1);
        }
                
        return answer-1;
    }
}