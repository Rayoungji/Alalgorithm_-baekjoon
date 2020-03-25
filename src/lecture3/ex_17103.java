package lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 배열: 정의와 동시에 고정적인 크기를 지정해주어야 한다.
*       데이터에 대한 인덱스 값이 고정되어 있다 -> 메모리 낭비
*       성능이 좋음 ->빠르다
* list: 크기가 유동적이다.
*       빈 엘리먼트는 허용하지 않는다 ->인덱스는 데이터들의 순서를 나타내는 정도로 사용한다
*       arrayList와 linkedList가 있다
*       ->인덱스를 이용하여 데이터 접근할 때는 array, 데이터를 추가/삭제하는 일이 많을 때는 linked를 사용한다*/

public class ex_17103 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        Boolean []isdecimal=new Boolean[1000001]; //소수이면 true
       for(int i=2; i<isdecimal.length; i++){
           isdecimal[i]=true; // 배열 초기화 하기
       }
       //에라토스테네스의 체 방식으로 소수 찾기
       for(int i=2; i<isdecimal.length; i++){
           if(isdecimal[i]==true){
               for(int j=i+i; j<isdecimal.length; j+=i){
                   isdecimal[j]=false;  //소수 아닌거 걸러내기
               }
           }else{
              continue;
           }
       }
       //골드바흐의 추측
        for(int i=0; i<t; i++){
            int question=Integer.parseInt(br.readLine());
            int answer=0;
            for(int j=2; j<=question/2; j++){
              if(isdecimal[j] && isdecimal[question-j]){
                  answer+=1;
              }
            }
            System.out.println(answer);
        }
    }
}
