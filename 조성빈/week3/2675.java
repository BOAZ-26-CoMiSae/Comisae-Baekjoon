package 조성빈.week3;

import java.util.Scanner;

public class 2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int r = sc.nextInt();
            String s = sc.next(); 


            StringBuilder sb = new StringBuilder();


            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j); 
                
                for (int k = 0; k < r; k++) {
                    sb.append(ch); 
                }
            }

            System.out.println(sb.toString());
        }

        sc.close();
    }
}
