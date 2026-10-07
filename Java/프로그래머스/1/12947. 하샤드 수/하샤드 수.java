class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = String.valueOf(x);
        int sum = 0;
        
        for (char ch : str.toCharArray()){
            sum += ch - '0';
        }
        if(x % sum == 0){
            answer = true;
        }
        return answer;
    }
}