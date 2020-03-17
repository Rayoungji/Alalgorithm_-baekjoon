package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex_1978 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        List<Integer> array=new ArrayList<>();
        int answer=0;
        for(int i=0; i<str.length; i++){
            array.add(Integer.parseInt(str[i]));
        }
        for(int i=0; i<t; i++) {
            Boolean is = true;
            if(array.get(i)<2){
                is=false;
            }
            for (int j = 2; j < array.get(i); j++) {
                if (array.get(i) % j == 0) {
                    is = false;
                }
            }
            if(is==true){
                answer+=1;
            }
        }
        System.out.print(answer);
    }
}
