package BaekJun.CodePlus.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_14002 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int arr[] = new int[1001];
        int dp[] = new int[1001];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (dp[i] == 0) {
                dp[i] = 1;
            }
            for (int j = 0; j < i; j++) {
                if (dp[i] < dp[j] + 1 && arr[i] > arr[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int value=dp[0];
        for(int i=1; i<dp.length; i++){
            value=Math.max(value,dp[i]);
        }

        System.out.println(value);

        Stack<Integer>stack=new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(value==dp[i]){
                stack.add(arr[i]);
                value--;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            System.out.print(" ");
        }
    }
}
