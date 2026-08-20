class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] idx = new int[before.length()];
        for (char str : after.toCharArray()){
            for(int i=0; i<before.length(); i++){
                if(str == before.charAt(i) && idx[i] == 0){
                    idx[i] = 1;
                    break;
                }
            }
        }
        
        for (int num : idx){
            if (num != 1){
                answer = 0;
            }
        }
        return answer;
    }
}