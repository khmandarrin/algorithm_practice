import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        ArrayList<Integer> lostList = new ArrayList<>();
for (int l : lost) lostList.add(l);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i: reserve){
            list.add(i);
        }
        
        for (int i = 0; i < lostList.size(); i++){
            int std = lostList.get(i);
            if (list.contains(std)){
                lostList.remove(i);
                list.remove(Integer.valueOf(std));
                i--;
            }
        }
        Collections.sort(list);
        Collections.sort(lostList);
        
        int answer = n - lostList.size();
        
        for (int num: lostList){
            if(list.contains(num-1)) {
                answer++;
                list.remove(Integer.valueOf(num-1));
            }else if (list.contains(num+1)){
                answer++;
                list.remove(Integer.valueOf(num+1));
            }
        }
            
        return answer;
    }
}