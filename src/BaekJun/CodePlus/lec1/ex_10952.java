package BaekJun.CodePlus.lec1;

import java.util.Scanner;

public class ex_10952 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
