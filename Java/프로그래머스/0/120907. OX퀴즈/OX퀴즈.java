class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            String str = quiz[i];
            String[] exp = str.split(" ");
            int pre = Integer.parseInt(exp[0]);
            int post = Integer.parseInt(exp[2]);
            int res = Integer.parseInt(exp[4]);
            
            int calc = exp[1].equals("+") ? pre + post : pre - post;
            answer[i] = (calc == res) ? "O" : "X";
        }
        return answer;
    }
}