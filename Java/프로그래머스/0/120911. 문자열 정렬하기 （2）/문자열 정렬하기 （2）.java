import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char ch : my_string.toCharArray()){
            if (ch >= 'A' && ch <= 'Z'){
                answer.append((char) (ch + 32));
            }else{
                answer.append(ch);
            }
        }
        char[] arr = answer.toString().toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }
}