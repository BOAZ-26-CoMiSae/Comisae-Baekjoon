package 조성빈.week3;

import java.util.Scanner;
import java.util.HashSet;

public class 3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<=10; i++) {
            int input = sc.nextInt();
            set.add(input % 42);
        }
        System.out.println(set.size());
        sc.close();
    }
}
