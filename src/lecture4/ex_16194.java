package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_16194 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int []answer=new int[N+1];
        String str[]=br.readLine().split(" ");

        for(int i=1; i<=N; i++){
            answer[i]=Integer.parseInt(str[i-1]);
            for(int j=1; j<=i/2; j++){
                answer[i]=Math.min(answer[i],(answer[j]+answer[i-j]));
            }
        }
        System.out.println(answer[N]);
    }
}
