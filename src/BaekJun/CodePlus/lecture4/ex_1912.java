package BaekJun.CodePlus.lecture4;

import java.io.*;

public class ex_1912 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int arr[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int max = arr[0];
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }

        System.out.print(max);
    }
}
