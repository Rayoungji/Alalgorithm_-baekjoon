package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex_1929 {
    public static void main(String arg[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer stringTokenizer=new StringTokenizer(str);
        int a=Integer.parseInt(stringTokenizer.nextToken());
        int b=Integer.parseInt(stringTokenizer.nextToken());
        Queue<Integer>queue=new LinkedList<>();
        Boolean isAnswer;

        for (int i=a; i<=b; i++){
            isAnswer=true;
            if(i==1){
                continue;
            }
            if(i==2){
                queue.add(i);
            }
            if(i%2==0){
                continue;
            }
            for(int j=3; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isAnswer=false;
                    break;
                }
            }
            if(isAnswer){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
