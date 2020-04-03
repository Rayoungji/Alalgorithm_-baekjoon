package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_11052 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());   //N
        int[] p = new int[N + 1];  //pn값들
        int []answer=new int[N+1];  //디피 정답들
        String str[] = br.readLine().split(" ");

        for (int i = 1; i <= str.length; i++) {
            p[i] = Integer.parseInt(str[i - 1]);  //pi~pN
        }

        answer[0]=0;
        answer[1]=p[1];
        for(int i=2; i<=N; i++) {
            int max=p[i];
            for (int j = 1; j <=i-1 ; j++) {
                max=Math.max(max, (p[j] + answer[i - j]));
            }
            answer[i]=max;
        }
        System.out.println(answer[N]);
    }
}
