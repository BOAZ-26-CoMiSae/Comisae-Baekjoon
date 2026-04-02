package 남민서.week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();   // 앞뒤 공백 제거해 한 줄 전체를 문자열로 읽음
        
        // 빈 문자열 체크 
        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        // 공백 기준으로 단어 분리해, 분리된 단어 개수 반환 
        StringTokenizer st = new StringTokenizer(line);
        System.out.println(st.countTokens());
    }
}