package BaekJun.CodePlus.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_11053 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int sequence[] = new int[n + 1];
        int dp[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) {
                dp[i] = 1;
            }
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                } else {
                    continue;
                }
            }
        }
        int answer=dp[0];
        for(int i=1; i<dp.length; i++) {
            if (answer < dp[i]) {
                answer=dp[i];
            }
            else{
                continue;
            }
        }

        System.out.println(answer);
    }
}
