package lecture2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*StringBuilder이 arraylist보다 메모리도 빠르고 좋아유*/
public class ex_1874 {
    public static void main(String arg[]) throws IOException{
        int peek=0,highest=0;
        List<Character> result = new ArrayList<>();
        Boolean isv=true;
        Stack<Integer>stack=new Stack<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int num=Integer.parseInt(br.readLine());
            if(num>peek){
                    for(int j=highest; j<num; j++){
                        stack.push(j+1);
                        result.add('+');
                    }
                highest=num;
                stack.pop();
                result.add('-');
                if(!stack.isEmpty())peek=stack.peek();
            }
            if(num==peek){
                    stack.pop();
                result.add('-');
                if(!stack.isEmpty())peek=stack.peek();
            }
            if(num<peek){
                isv=false;
            }
        }
        if (!isv){System.out.println("NO");
        }else {
            for(Character ch : result)
                System.out.println(ch);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
