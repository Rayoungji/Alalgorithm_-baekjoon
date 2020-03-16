package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex_2609 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        List<Integer> array=new ArrayList<>();
        for(int i=0; i<str.length; i++){
            array.add(Integer.parseInt(str[i]));
        }
        int answer1=gcd(array.get(0),array.get(1));
        System.out.println(answer1);
        int answer2=array.get(0)*array.get(1)/answer1;
        System.out.println(answer2);

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
