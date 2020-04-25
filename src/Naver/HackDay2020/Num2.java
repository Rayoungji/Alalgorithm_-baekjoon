package Naver.HackDay2020;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Num2 {
    public static void main(String arg[]) {
        String[] id_list = {"A B C D", "A D", "A B D", "B D"};
        solution(id_list,2);
        System.out.print( solution(id_list,2));
    }

    public static int solution (String[]id_list,int k){
        Map<String, Integer> map=new HashMap<>();
        Stack<String> stack = new Stack<>();
        int cnt=1;
        int answer=0;
        for (int i = 0; i < id_list.length; i++) {
            String ids[] = id_list[i].split(" ");
            for(int j=0; j<ids.length; j++){
                if(stack.contains(ids[j])){
                    continue;
                }
                else{
                    stack.add(ids[j]);
                }
            }
            while (!stack.isEmpty()){
                map.put(stack.pop(),cnt);
            }
            cnt++;
        }
        for(String key : map.keySet()){
            int value = map.get(key);

            if(value>=k){
                answer+=k;
            }
            else{
                answer+=value;
            }
        }

        return answer;
    }

}
