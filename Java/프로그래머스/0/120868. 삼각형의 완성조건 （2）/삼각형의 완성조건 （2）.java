class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int cnt = 0;
        
        for (int i=1; i<=max; i++){
            if (max < min + i){
                cnt++;
            }
        }
        
        for (int i=max+1; i < max+min; i++){
            if (i < max+min){
                cnt++;
            }
        }
        return cnt;
    }
}