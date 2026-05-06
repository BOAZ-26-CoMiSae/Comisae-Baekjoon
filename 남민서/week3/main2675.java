package 남민서.week3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 1) BufferedReader 방식
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int t = Integer.parseInt(br.readLine());

// 2) Scanner 방식
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();

// =====

// nextToken()
// 쪼개진 값들 중에서 다음 값을 꺼내는 메서드임
// StringTokenizer가 값들을 쪼개서 줄 세워놓으면 nextToken()이 앞에서부터 꺼냄 

// readLine()
// 한 줄 전체 읽기 때문에 띄어쓰기로 입력 받으면 정수 변환 못해서 에러
// 따라서 이 경우는 StringTokenizer 사용 !

// =====

// StringBuilder()
// 문자열을 효율적으로 이어붙이기 위한 도구로, 같은 공간에 계속 이어 붙이므로 빠름

// String 방식 = 이어 붙일 때마다 새로운 객체를 만들어야 해서 느림
    // String result = "";
    // result = result + "AAA";

// =====


public class main2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트케이스 개수 (문자열로 읽어서 정수로 변환)
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            // 한 줄을 읽어서 공백 기준으로 분리 
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            // 쪼갠 값을 하나씩 꺼내어 변수에 대입 
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            // 각 문자를 r번 반복해서 새 문자열 만들기 
            StringBuilder sb = new StringBuilder();   // 문자열 담을 빈 바구니 만들기 
            for (char ch : s.toCharArray()) {             // 문자열을 문자 하나하나로 쪼갠 후 하나씩 꺼냄 
                sb.append(String.valueOf(ch).repeat(r));  // 문자를 r번 반복 
            }
            
            System.out.println(sb);
        }
    }
}