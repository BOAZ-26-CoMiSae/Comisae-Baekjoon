import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      String s = br.readLine();

      int count = 0;
      int sum = 0;
      for (char c : s.toCharArray()) {
        if (c == 'O') {
          count++;
          sum += count;
        } else {
          count = 0;
        }
      }

      System.out.println(sum);
    }
  }
}