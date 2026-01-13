import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int i: arr){
            if (stk.isEmpty() || stk.peek() != i){
                stk.push(i);
            }
        }
        
        int[] answer = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++){
            answer[i] = stk.get(i);
        }
    
        return answer;
    }
}