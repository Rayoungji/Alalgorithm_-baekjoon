package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*n의 최댓값 넣어서 정답 범위 확인해보기*/

public class ex_2193 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long zero[]=new long[n+1];
        long one[]=new long[n+1];

        zero[1]=0;
        one[1]=1;

        for(int i=2; i<=n; i++){
            zero[i]=zero[i-1]+one[i-1];
            one[i]=zero[i-1];
        }

        long answer=zero[n]+one[n];
        System.out.println(answer);
    }
}
