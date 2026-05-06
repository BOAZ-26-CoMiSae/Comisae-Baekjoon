import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int r = Integer.parseInt(st.nextToken());
      String s = st.nextToken();

      StringBuilder sb = new StringBuilder();
      for (char c : s.toCharArray()) {
        for (int j = 0; j < r; j++) {
          sb.append(c);
        }
      }

      System.out.println(sb);
    }

  }
}