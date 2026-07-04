class Solution {
    public int solution(String my_string) {
        int num = 0;
        int answer = 0;
        for(char ch: my_string.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch-'0');
            }else{
                answer+=num;
                num=0;
            }
        }
        answer+=num;
        return answer;
    }
}