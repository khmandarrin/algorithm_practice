class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        int answer = 0;
        
        for(int[] line : lines){
            for(int i=line[0]; i<line[1]; i++){
                count[i+100]++;
            }
        }
        
        for(int i=0; i<count.length; i++){
            if(count[i]>=2) answer++;
        }
        
        return answer;
    }       
}