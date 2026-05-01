import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = 0;
    while (st.hasMoreTokens()) {
      int num = Integer.parseInt(st.nextToken());

      if (num == 1) {
        continue;
      }

      int m = (int) Math.sqrt(num);
      int i = 2;
      for (; i <= m; i++) {
        if (num % i == 0) {
          break;
        }
      }
      if (i > m) {
        count++;
      }
    }
    System.out.println(count);
  }
}