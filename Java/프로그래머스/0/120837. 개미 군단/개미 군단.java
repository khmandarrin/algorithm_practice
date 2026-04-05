class Solution {
    public int solution(int hp) {
        int answer = 0, rem = 0;
        
        answer = hp / 5; // 4
        rem = hp % 5; // 3
        
        if (rem >= 3) {
            answer += rem / 3; // 5
            rem %= 3; // 0
            
            return answer += rem; //
        }
        
        
        return answer + (hp % 5);
    }
}