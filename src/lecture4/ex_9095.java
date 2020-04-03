package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_9095 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] answer = new int[12];
        answer[0] = 1;
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 3; j <= num; j++) {
                answer[j] = answer[j - 1] + answer[j - 2] + answer[j - 3];
            }
            System.out.println(answer[num]);
        }
    }
}
