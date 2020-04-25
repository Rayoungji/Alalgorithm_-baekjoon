package BaekJun.CodePlus.lecture2;

import java.util.Scanner;
import java.util.Stack;

public class ex_9093 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String str=sc.nextLine();
            str+="\n";
            Stack <Character> stack=new Stack<>();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)==' ' || str.charAt(j)=='\n'){
                    while(!stack.isEmpty()){
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                }else{
                    stack.push(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
