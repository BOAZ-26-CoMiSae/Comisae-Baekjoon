package 조성빈.week4;
import java.util.Scanner;

public class 8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            String s = sc.next();

            int totalScore = 0;
            int currentOCount = 0;

            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j) == 'O') {
                    currentOCount++;
                    totalScore += currentOCount;
                } else {
                    currentOCount = 0; //Point : 연속되고 있는 O 이 끝나면 리셋하여 연속추가할당 스톱시켜주기
                }
            }
            System.out.println(totalScore);
        }
        sc.close();
    }
}
