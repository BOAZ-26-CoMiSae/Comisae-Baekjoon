import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 내 풀이
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0 && c == 0) {
        break;
      }

      if (c < a) {
        int temp = c;
        c = a;
        a = temp;
      }
      if (c < b) {
        int temp = c;
        c = b;
        b = temp;
      }

      if (c * c == a * a + b * b) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }

  // LLM: Math.max() -> 최대가 누군지 알 필요가 없음
  StringBuilder sb = new StringBuilder();
  String line;

  while((line=br.readLine())!=null)
  {
    StringTokenizer st = new StringTokenizer(line);
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    if (a == 0 && b == 0 && c == 0)
      break;

    int max = Math.max(a, Math.max(b, c));
    int sumSq = a * a + b * b + c * c - max * max;

    sb.append(max * max == sumSq ? "right" : "wrong").append('\n');
  }

  System.out.print(sb);
}