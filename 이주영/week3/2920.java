import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int ans = 0;
    int prev = Integer.parseInt(st.nextToken());

    if (prev == 1) {
      ans = 1;
    } else if (prev == 8) {
      ans = -1;
    } else {
      System.out.println("mixed");
      return;
    }

    while (st.hasMoreTokens()) {
      int next = Integer.parseInt(st.nextToken());
      if (prev < next && ans == -1 || prev > next && ans == 1) {
        ans = 0;
        break;
      }
      prev = next;
    }

    if (ans == 0) {
      System.out.println("mixed");
    } else if (ans == 1) {
      System.out.println("ascending");
    } else {
      System.out.println("descending");
    }
  }
}