class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        int temp = slice;
        
        while (slice < n){
            pizza++;
            slice+=temp;
        }
        
        return pizza;
    }
}