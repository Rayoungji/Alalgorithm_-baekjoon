package BaekJun.CodePlus.lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex_1934 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String str[]=br.readLine().split(" ");
            List<Integer> array=new ArrayList<>();
            for(int j=0; j<str.length; j++){
                array.add(Integer.parseInt(str[j]));
            }
            int answer1=gcd(array.get(0),array.get(1));
            int answer2=array.get(0)*array.get(1)/answer1;
            System.out.print(answer2+"\n");
        }
    }
    static int gcd(int a, int b){

        while (b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
