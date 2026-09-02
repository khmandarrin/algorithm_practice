class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num=i; num<=j; num++){
            String str = String.valueOf(num);
            for (char ch: str.toCharArray())
                if (ch-'0' == k){
                    answer++;
                }
        }
        
        return answer;
    }
}