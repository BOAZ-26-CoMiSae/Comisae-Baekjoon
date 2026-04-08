import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        int[] arr = new int[26];
        Arrays.fill(arr, -1); // 모든 배열을 -1로 초기화
        
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int index = ch - 'a'; // 'a'의 아스키코드를 빼서 0~25 사이의 인덱스 도출
            
            // 배열 값이 -1인 경우(아직 등장하지 않은 경우)에만 현재 위치 기록
            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
