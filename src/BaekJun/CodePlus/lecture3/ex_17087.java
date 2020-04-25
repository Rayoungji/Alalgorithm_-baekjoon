package BaekJun.CodePlus.lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex_17087 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);  //동생 명 수
        int S=Integer.parseInt(str[1]);  //수빈이 위치

        String Nstr[]=br.readLine().split(" ");
        List<Integer> Snumber=new ArrayList<>();
        for(int i=0; i<Nstr.length; i++){
           if(S>Integer.parseInt(Nstr[i])){
               Snumber.add(S-Integer.parseInt(Nstr[i]));
           }else{
               Snumber.add(Integer.parseInt(Nstr[i])-S);
           }
        } //수빈이와 동생들 위치 차이 Snumber에 저장하기
        int answer=Snumber.get(0);
        if(Snumber.size()!=1){
            for(int i=1; i<Snumber.size(); i++){
                answer=getGCD(answer,Snumber.get(i));
            }
            System.out.println(answer);
        }else{
            System.out.println(answer);
        }
    }
    static int getGCD(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
