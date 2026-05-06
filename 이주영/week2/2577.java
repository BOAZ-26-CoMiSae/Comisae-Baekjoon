import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    int mul = a * b * c;

    // --- 1 ---
    Map<Integer, Integer> count = new HashMap<>();
    while (mul > 0) {
      int remained = mul % 10;
      mul /= 10;
      count.put(remained, count.getOrDefault(remained, 0) + 1);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(count.getOrDefault(i, 0));
    }

    // --- 2 ---
    // 배열 사용
    int[] count2 = new int[10];

    while (mul > 0) {
      count2[mul % 10]++;
      mul /= 10;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(count[i]);
    }

    // --- 3 ---
    // 문자열 사용
    String s = String.valueOf(a * b * c);
    int[] count2 = new int[10];

    for (char c : s.toCharArray()) {
      count2[c - '0']++;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(count[i]);
    }
  }
}