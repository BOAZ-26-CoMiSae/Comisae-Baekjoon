package 조성빈.week2;

import java.util.Scanner;

public class 1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim(); 


        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split("\\s+");
            System.out.println(words.length);
        }
    }
}
