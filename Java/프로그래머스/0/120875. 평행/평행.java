class Solution {
    public int solution(int[][] dots) {
                
        // 0-1/2-3
        if (isparallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        // 0-2/1-3
        if (isparallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        // 0-3/1-2
        if (isparallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        
        return 0;
}
    boolean isparallel(int[] p1, int[] p2, int[] p3, int[] p4){
        return (p2[1]-p1[1])*(p4[0]-p3[0]) == (p4[1]-p3[1])*(p2[0]-p1[0]);
    }
}