class Solution {
    public int solution(int a, int b) {
        int c = Math.min(a,b);
        
        while(c > 0){
            if ((a%c==0) && (b%c==0)) break;
            c--;
        }
        
        b/=c;
        
        for (int i=2; i<=b; i++){
            while(b % i == 0){
                if (i != 2 && i != 5) return 2;
                b/=i;
            }
        }
        
        return 1;
    }
}