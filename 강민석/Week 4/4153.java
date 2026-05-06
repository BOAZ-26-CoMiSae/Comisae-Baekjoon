import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] sides = new int[3];
            
            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());
            
            // 0 0 0 이 입력되면 반복 종료
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }
            
            // 빗변(가장 긴 변)을 찾기 위해 오름차순 정렬
            Arrays.sort(sides);
            
            // 피타고라스의 정리 (a^2 + b^2 = c^2) 적용
            if ((sides[0] * sides[0]) + (sides[1] * sides[1]) == (sides[2] * sides[2])) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }
        System.out.print(sb);
    }
}
