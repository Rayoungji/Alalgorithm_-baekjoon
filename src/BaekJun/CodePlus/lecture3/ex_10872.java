package BaekJun.CodePlus.lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_10872 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int answer=1;
        for(int i=1; i<=t; i++){
            answer*=i;
        }
        System.out.println(answer);
    }
}
