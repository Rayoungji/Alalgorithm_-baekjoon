package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_2004 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer stringTokenizer=new StringTokenizer(str);
        long n=Long.parseLong(stringTokenizer.nextToken());
        long m=Long.parseLong(stringTokenizer.nextToken());
        long two=0, five=0;

        for(long i=2; i<=n; i*=2){
            two+=n/i;
        }
        for(long i=2; i<=(n-m); i*=2){
            two-=(n-m)/i;
        }
        for(long i=2; i<=m; i*=2){
            two-=m/i;
        }
        for(long i=5; i<=n; i*=5){
            five+=n/i;
        }
        for(long i=5; i<=(n-m); i*=5){
            five-=(n-m)/i;
        }
        for(long i=5; i<=m; i*=5){
            five-=m/i;
        }

        if(two<=five){
            System.out.println(two);
        }else{
            System.out.println(five);
        }
    }
}
