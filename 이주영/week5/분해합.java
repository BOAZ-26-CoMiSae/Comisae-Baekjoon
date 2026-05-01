import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int gen = Math.max(0, N - 54);

    for (; gen < N; gen++) {
      int num = gen;
      int temp = gen;
      while (temp > 0) {
        num += temp % 10;
        temp /= 10;
      }
      if (num == N) {
        break;
      }
    }

    if (gen == N) {
      System.out.println(0);
    } else {
      System.out.println(gen);
    }
  }
}