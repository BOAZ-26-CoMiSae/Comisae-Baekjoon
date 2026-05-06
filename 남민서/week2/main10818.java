package 남민서.week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 첫째 줄 읽기 
        StringTokenizer st = new StringTokenizer(br.readLine());   // 둘째 줄 읽기 (한줄 전체를 문자열로 읽고, 공백 기준으로 토큰 분리)

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println(min + " " + max);
    }
}