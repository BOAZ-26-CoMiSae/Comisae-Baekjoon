package 남민서.week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 각각 한 줄로 입력 받기
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        // 곱셈 후 문자열 변환
        String result = String.valueOf(a * b * c);
        
        // 각 자릿수 개수 세기
        int[] count = new int[10];
        for (int i = 0; i < result.length(); i++) {
            count[Character.getNumericValue(result.charAt(i))]++;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}