import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numbers = Arrays.stream(numlist)
            .boxed()
            .toArray(Integer[]::new);
            
            Arrays.sort(numbers, (a,b) -> {
                int disA = Math.abs(n-a);
                int disB = Math.abs(n-b);
                if(disA != disB){
                    return disA-disB;
                }
                return b-a;
            });
            return Arrays.stream(numbers).mapToInt(i->i).toArray();
    }
}