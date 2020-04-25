package BaekJun.CodePlus.lecture4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_1699 {
  public static void main(String arg[]) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      int dp[]=new int[n+1];  //dp[i]=i를 제곱수들의 합으로 표현할 때 그 항의 최소 갯수

      for(int i=1; i<=n; i++){
          dp[i]=i;
          for(int j=1; j*j<=i; j++) {
              if (dp[i] > dp[i - j * j] + 1) {
                  dp[i] = dp[i - j * j] + 1;
              }
          }
      }
      System.out.println(dp[n]);
  }
}

/*
i*i + dp[n-i*i]
만약에 n이 12일 때 합을 나타낼 수 있는 제곱수들은 1,2*2(4),3*3(9)가 있다
제곱수(1번) + n에서 제곱수를 뺀 수의 dp값을 구하여 최소값이 되는것이 dp값이 된다
 */
