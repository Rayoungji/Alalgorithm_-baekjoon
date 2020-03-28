package lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*배열 사용할 때 배열의 범위 꼭!!!!! 확인하기 문제에서 주어지는 테스트케이스에 대한 범위들 확인 후 배열 크기 정하기!!!
* 배열읠 크기가 2이면 array[2]는 사용할 수 없다!! 무족권 n+1이런 형태로 하기
* 근데 웬만하면 문제에서 주어진 범위+1로 잡고 하는게 나은듯 ㅠㅠ*/
public class ex_11726 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] answer = new int[10001];
        answer[1] = 1;
        answer[2] = 2;
        if (t >= 3) {
            for (int i = 3; i <= t; i++) {
                answer[i] = (answer[i - 1] + answer[i - 2]) % 10007;
            }
        }
        System.out.println(answer[t]);
    }
}

