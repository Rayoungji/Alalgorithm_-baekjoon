package BaekJun.CodePlus.lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex_1158 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> first=new LinkedList<>();
        List<Integer> answer=new ArrayList<>();
        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int t = Integer.parseInt(tokenizer.nextToken());  //t
        int num = Integer.parseInt(tokenizer.nextToken());  //num
        int remove;
        int cnt=t;
        for (int i = 0; i < t; i++) {
            first.add(i+1);
        }
        while (cnt>0){
                for (int j = 0; j < num - 1; j++) {
                    remove = first.remove();
                    first.add(remove);
                }
            answer.add(first.remove());
            cnt--;
        }
        System.out.print("<");
        for(int j=0; j<answer.size()-1; j++){
            System.out.print(answer.get(j)+", ");
        }
        System.out.print(answer.get(t-1));
        System.out.print(">");
    }
}
