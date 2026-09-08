class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if (M==N && N==1) {return answer;}
        
        answer = M-1 + (N-1)*M;
        
        
        return answer;
    }
}