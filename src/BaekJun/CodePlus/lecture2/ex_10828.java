package BaekJun.CodePlus.lecture2;

import java.util.Scanner;
import java.util.Stack;

/*push(추가),pop(삭제),empty(),size(갯수),top*/
public class ex_10828 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<t; i++) {
            String str = sc.nextLine();
            if (str.contains("push")) {
              int num=Integer.parseInt(str.substring(5));
              stack.push(num);
            }
            if (str.contains("pop")) {
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else {
                System.out.println(stack.pop());}
            }
            if (str.contains("empty")) {
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
            if(str.contains("size")){
                System.out.println(stack.size());
            }
            if(str.contains("top")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                System.out.println(stack.peek());}
            }
        }
    }
}
