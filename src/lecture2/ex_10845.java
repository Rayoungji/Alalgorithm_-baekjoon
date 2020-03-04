package lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex_10845 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        Deque<Integer> queue=new ArrayDeque<>();
        for(int i=0; i<t; i++){
            String str=br.readLine();

            if(str.contains("push")) {
                StringTokenizer token=new StringTokenizer(str);
                String command=token.nextToken();
                String command1=token.nextToken();
                int num=Integer.parseInt(command1);
                queue.add(num);
            }
            if(str.contains("pop")){
                if(!queue.isEmpty()){
                   System.out.println(queue.pollFirst());
                }else {
                    System.out.println(-1);
                }
            }
            if(str.contains("size")){
                System.out.println(queue.size());
            }
            if(str.contains("empty")){
                if(!queue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(1);
                }
            }
            if(str.contains("front")){
                if(!queue.isEmpty()){
                    System.out.println(queue.peek());
                }else{
                    System.out.println(-1);
                }
            }
            if(str.contains("back")){
                if(!queue.isEmpty()){
                    System.out.println(queue.peekLast());
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}
