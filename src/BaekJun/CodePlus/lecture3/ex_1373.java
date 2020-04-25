package BaekJun.CodePlus.lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_1373 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> answer=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0'){
                stack.add(0);
            }
            if(str.charAt(i)=='1'){
                stack.add(1);
            }
        }
        while (!stack.isEmpty()){
            int qAnswer=0;
            for(int i=0; i<3; i++){
                if(i==0){
                    qAnswer+=stack.pop()*1;
                }
                if(i==1){
                    qAnswer+=stack.pop()*2;
                }
                if(i==2){
                    qAnswer+=stack.pop()*4;
                }
                if(stack.isEmpty()){
                    break;
                }
            }
            answer.add(qAnswer);
        }
        while (!answer.isEmpty()) {
            System.out.print(answer.pop());
        }
    }
}
