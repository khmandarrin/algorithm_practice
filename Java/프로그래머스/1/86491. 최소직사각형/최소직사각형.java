
class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min_max = 0;
        for (int[] size: sizes){
            int w = size[0];
            int h = size[1];
            
            if(max<Math.max(w, h)){
                max = Math.max(w, h);
            };
            if (min_max < Math.min(w, h)){
                min_max = Math.min(w, h);
            }
        }
        return max*min_max;
    }
}