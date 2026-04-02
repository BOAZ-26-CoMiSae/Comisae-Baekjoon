package 조성빈.week2;

import java.util.Scanner;

public class 2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;     // 최댓값을 저장할 변수
        int index = 0;   // 몇 번째 숫자인지 저장할 변수
        
        // 문제에서 주어진 대로 9개의 숫자를 입력받습니다.
        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            
            // 현재 입력받은 숫자가 기존 최댓값보다 크면 갱신
            if (num > max) {
                max = num;
                index = i;
            }
        }
        
        // 결과 출력: 첫째 줄에 최댓값, 둘째 줄에 위치
        System.out.println(max);
        System.out.println(index);
        
        sc.close();
    }
}
