package BaekJun.CodePlus.lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex_10430 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        List<Integer> array=new ArrayList<>();

        for(int i=0; i<str.length; i++){
            array.add(Integer.parseInt(str[i]));
        }

        int answer1=(array.get(0)+array.get(1))%array.get(2);
        System.out.println(answer1);
        int answer2=answer1%array.get(2);
        System.out.println(answer2);
        int answer3=(array.get(0)*array.get(1))%array.get(2);
        System.out.println(answer3);
        int answer4=answer3%array.get(2);
        System.out.println(answer4);
    }
}
