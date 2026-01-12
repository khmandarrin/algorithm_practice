import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> pocketmon = new HashMap<>();
        for (int i: nums){
            pocketmon.put(i, pocketmon.getOrDefault(i, 0) + 1 );
        }
        
        if (pocketmon.size() > nums.length / 2){
            answer = nums.length / 2;
        }else{
            answer = pocketmon.size();
        }
        
        return answer;
    }
}

// 1번 1마리
// 2번 1마리 
// 3번 2마리 
// > 2마리, 2종
// 마리수랑 키 수 비교해서 마리수가 많으면 키 수, 마리수가 적으면 마리수