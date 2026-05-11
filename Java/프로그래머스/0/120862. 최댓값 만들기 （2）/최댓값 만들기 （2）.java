import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[0] * numbers[1], min = numbers[numbers.length-2] * numbers[numbers.length-1];
        
        return Math.max(max, min);
    }
}