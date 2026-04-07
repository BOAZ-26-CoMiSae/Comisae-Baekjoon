package 조성빈.week4;
import java.util.Scanner;
import java.util.Arrays;

public class 10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1); 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 아스키 코드를 이용해 인덱스 계산 (예: 'a' - 'a' = 0, 'b' - 'a' = 1)
            int index = ch - 'a';
            
            // 값이 -1인 경우(아직 기록된 적 없는 경우)에만 현재 인덱스 저장 - 중복 방지
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
        
        sc.close();
    }
}
