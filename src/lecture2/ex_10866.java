package lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex_10866 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque=new LinkedList<>();
        int X=0;
        int t=Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String str=br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(str);
            String string=tokenizer.nextToken();
            if(tokenizer.hasMoreTokens()) {
                X =Integer.parseInt(tokenizer.nextToken());
            }
            if (string.equals("push_front")) {
                deque.addFirst(X);
            }
            if (string.equals("push_back")) {
                deque.addLast(X);
            }
            if (string.equals("pop_front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.removeFirst());
                } else {
                    System.out.println(-1);
                }
            }
            if (string.equals("pop_back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.removeLast());
                } else {
                    System.out.println(-1);
                }
            }
            if(string.equals("size")){
                System.out.println(deque.size());
            }
            if(string.equals("empty")){
                if(!deque.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(1);
                }
            }
            if(string.equals("front")){
                if(!deque.isEmpty()){
                    System.out.println(deque.peekFirst());
                }else {
                    System.out.println(-1);
                }
            }
            if(string.equals("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast());
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
