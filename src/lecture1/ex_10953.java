package lecture1;

import java.util.Scanner;

public class ex_10953 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0; i<t; i++) {

            String str= sc.next();
            String[] answer = str.split(",");
            String a = answer[0];
            String b = answer[1];

            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);

            System.out.println(a1+b1);
        }

    }
}
