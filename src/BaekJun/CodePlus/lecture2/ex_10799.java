package BaekJun.CodePlus.lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_10799 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack=new Stack<>();
        int answer=0;
        String str=br.readLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){stack.push('(');}
            if(str.charAt(i)==')'){
                stack.pop();
                if(str.charAt(i-1)==')'){answer+=1;}
                else {
                    if (!stack.isEmpty()) {
                          answer+=stack.size();
                    }
                }
            }
        }
        System.out.print(answer);
    }
}
