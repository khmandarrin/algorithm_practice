class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab1 = Integer.parseInt(""+a+b);
        int ab2 = 2*a*b;
        
        return Math.max(ab1, ab2);
    }
}