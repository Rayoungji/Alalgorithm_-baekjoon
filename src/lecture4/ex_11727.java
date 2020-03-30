package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_11727 {
    public static int []answer=new int[1001];
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        answer[1]=1;
        answer[2]=3;

        for(int i=3; i<=t; i++){
            answer[i]=(2*answer[i-2]+answer[i-1])%10007;
        }
        System.out.println(answer[t]);
    }
}
