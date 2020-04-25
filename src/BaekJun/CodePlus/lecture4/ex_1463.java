package BaekJun.CodePlus.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_1463 {
    //public static int []min2;
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int []min=new int[1000000];
        min[0]=0;
        min[1]=0;

        //Bottom-up 방식
        for(int i=2; i<=t; i++){
            min[i]=min[i-1]+1; //무조건 1로 뺐을 때 횟수
            if(i%2==0){
                min[i]=Math.min(min[i/2]+1, min[i]); //-1한 횟수와 2로 나눈 횟수 비교하기
            }
            if(i%3==0){
                min[i]=Math.min(min[i/3]+1, min[i]); //-1한 횟수와 3으로 나눈 횟수 비교하기
            }
        }
//        min2=new int[t+1];
//        System.out.println(getMin(t));
        System.out.println(min[t]);
    }

    //Top-down 방식
//    public static int getMin(int n) {
//        if (n == 1) {
//            return 0;
//        }
//        //캐시 쓰는 부분 min2[n]이 있으면 이것을 리턴
//        if(min2[n]>0){
//            return min2[n];
//        }
//        min2[n] = getMin(n - 1) + 1;
//        if (n % 2 == 0) {
//            min2[n] = Math.min(getMin(n / 2) + 1, min2[n]);
//        }
//        if (n % 3 == 0) {
//            min2[n] = Math.min(getMin(n / 3) + 1, min2[n]);
//        }
//        return min2[n];
//    }
}
