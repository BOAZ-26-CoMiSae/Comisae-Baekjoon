import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // --- 1 ---
    // null 체크 -> trim 순서 지키기
    String line = br.readLine();

    if (line == null || line.trim().isEmpty()) {
      System.out.println(0);
    } else {
      String[] a = line.split("\\s+");
      System.out.println(a.length);
    }

    // --- 2 ---
    // StringTokenizer는 기본 구분자로 " \t\n\r\f" 모두 가짐
    StringTokenizer st = new StringTokenizer(br.readLine());
    int ans = 0;

    while (st.hasMoreTokens()) {
      st.nextToken();
      ans++;
    }

    System.out.println(ans);

    // --- 3 ---
    // countTokens() 사용
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    int ans2 = st2.countTokens();

    System.out.println(ans2);
  }
}