class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for (char ch : str.toCharArray()){
            
            sb.append((char) ('a' + (ch - '0')));
        }
        
        return sb.toString();
    }
}