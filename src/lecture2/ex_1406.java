package lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_1406 {
    public static void main(String arg[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> left=new Stack<>();
        Stack<Character> right=new Stack<>();
        List<Character> result = new ArrayList<>();

        String str=br.readLine();
        for(int i=0; i<str.length(); i++){

            left.push(str.charAt(i));
        }
        int cursor=str.length()+1;

        int t=Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String command=br.readLine();

            if(command.contains("L")){
                if(!left.isEmpty()) {
                    Character pop = left.pop();
                    right.push(pop);
                    cursor -= 1;
                }else{
                    continue;
                }
            }
            if(command.contains("D")){
                if(!right.isEmpty()){
                    Character pop=right.pop();
                    left.push(pop);
                    cursor+=1;
                }else{
                    continue;
                }
            }
            if(command.contains("B")){
                if(!left.isEmpty()){
                    left.pop();
                    cursor-=1;
                }else{
                    continue;
                }
            }
            if(command.contains("P")){
                StringTokenizer token=new StringTokenizer(command);
                String p=token.nextToken();  //p
                String add=token.nextToken();  //add String
                left.push(add.charAt(0));
                cursor+=1;
            }
        }
        while (!left.isEmpty()) {
            for (int j = 0; j < left.size(); j++) {
                result.add(left.pop());
            }
        }
        for (int j = result.size() - 1; j >= 0; j--) {
            System.out.print(result.get(j));
        }

        while(!right.isEmpty()){
            System.out.print(right.pop());
        }
    }
}
