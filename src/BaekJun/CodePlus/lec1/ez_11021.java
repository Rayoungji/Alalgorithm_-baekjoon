package BaekJun.CodePlus.lec1;

import java.util.Scanner;

public class ez_11021 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0; i<t; i++){
            int num=i+1;
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Case #"+num+": "+(a+b));
        }
    }
}
