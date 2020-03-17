package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_6588 {
    public static void main(String arg[]) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       boolean [] isprime=new boolean[1000001];
       for(int i=2; i<=1000000; i++){
           isprime[i]=true; // 초기화
       }
       for(int i=2; i<=1000000; i++){
           for(int j=i*2; j<=1000000; j+=i){
               if(!isprime[j]) continue;;
               isprime[j]=false; //소수가 아닌 값들 false로 바꿔주기
           }
       }

       while (true){
           int t=Integer.parseInt(br.readLine());
           boolean ok=false;
           if(t==0) {break;}
           for(int i=2; i<=t; i++){
               if(isprime[i] && isprime[t-i]){
                   System.out.println(t+" = "+i+" + "+(t-i));
                   ok=true;
                   break;
               }
           }
           if(!ok){
               System.out.println("Goldbach's conjecture is wrong.");
           }
       }
    }
}

