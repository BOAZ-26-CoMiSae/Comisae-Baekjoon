import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    // --- 1 ---
    String[] arr = br.readLine().split(" ");

    int min = 1000000;
    int max = -1000000;
    for (String a : arr) {
      int temp = Integer.parseInt(a);
      if (temp < min) {
        min = temp;
      }
      if (temp > max) {
        max = temp;
      }
    }

    sb.append(min).append(" ").append(max);

    System.out.print(sb);

    // --- 2 ---
    // split -> StringTokenizer
    // 배열 생성 제거
    // 초기값 -> 첫 값 or Integer.MAX_VALUE, Integer.MIN_VALUE
    // 불필요한 StringBuilder 제거
    StringTokenizer st = new StringTokenizer(br.readLine());

    int temp = Integer.parseInt(st.nextToken());
    int min = temp;
    int max = temp;

    while (st.hasMoreTokens()) {
      temp = Integer.parseInt(st.nextToken());
      min = Math.min(min, temp);
      max = Math.max(max, temp);
    }

    System.out.println(min + " " + max);
  }
}