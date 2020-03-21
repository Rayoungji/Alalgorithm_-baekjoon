package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
그러면 이 짝에서 n(n-1) / 2개의 최대공약수들이 나오는데 그 수는 1 ~ 1,000,000의 범위를 가지므로
   총 합의 최대범위는 100*99 / 2 * 1,000,000 = 4,950,000,000(49억)이다.
   이는 int형의 표현범위 +-21억 을 넘고, unsigned int형의 표현범위 +42억을 넘어서는 값으로
   long long 형을 사용해야 한다.
 */
public class ex_9613 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String str[]=br.readLine().split(" ");
            List<Integer> number=new ArrayList<>();
            long answer=0;
            for(int j=0; j<str.length; j++) {
                number.add(Integer.parseInt(str[j]));
            }
            for(int i1=1; i1<=number.size()-2; i1++){
                for(int j1=i1+1; j1<=number.size()-1; j1++){
                    answer+=getGCD(number.get(i1),number.get(j1));
                }
            }
            System.out.println(answer);
        }
    }

    static int getGCD(int a, int b){
        while (b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
