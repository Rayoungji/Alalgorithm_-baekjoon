package BaekJun.CodePlus.lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_17413 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        string+='.';
        Boolean isTag = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if(isTag==false && string.charAt(i)=='<'){
                if(!stack.isEmpty()){
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(string.charAt(i));
                    isTag=true;
                    continue;
                }else {
                    System.out.print(string.charAt(i));
                    isTag = true;
                    continue;
                }
            }
            if(isTag==true&&string.charAt(i)!='>'){
                System.out.print(string.charAt(i));
            }
            if(isTag==true&&string.charAt(i)=='>'){
                System.out.print(string.charAt(i));
                isTag=false;
                continue;
            }
            if(isTag==false&&string.charAt(i)!=' '){
                stack.push(string.charAt(i));
            }
            if(isTag==false&&string.charAt(i)==' '){
                if(!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(string.charAt(i));
                }else{
                    System.out.print(string.charAt(i));
                }
            }
            if(isTag==false && string.charAt(i)=='.'){
                if(!stack.isEmpty()) {
                    stack.pop();
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                }else{
                    continue;
                }
            }
        }
    }
}
