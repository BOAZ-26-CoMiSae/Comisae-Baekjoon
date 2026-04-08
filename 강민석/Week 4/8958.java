import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int count = 0; // 연속된 'O'의 개수
            int sum = 0;   // 총 점수
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0; // 'X'를 만나면 연속 점수 초기화
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
