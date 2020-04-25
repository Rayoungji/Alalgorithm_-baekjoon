package BaekJun.CodePlus.lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_1676 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        System.out.println(t/5+t/25+t/125);
    }
}
