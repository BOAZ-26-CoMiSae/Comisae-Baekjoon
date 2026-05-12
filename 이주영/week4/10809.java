import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 내 풀이
    String s = br.readLine();
    char[] a = s.toCharArray();

    int[] alphabet = new int[26];
    Arrays.fill(alphabet, -1);

    for (int i = 0; i < a.length; i++) {
      if (alphabet[a[i] - 'a'] == -1) {
        alphabet[a[i] - 'a'] = i;
      }
    }

    for (int i = 0; i < 26; i++) {
      System.out.print(alphabet[i] + " ");
    }

    // LLM: chatAt(), StringBuilder
    int[] alphabet = new int[26];
    Arrays.fill(alphabet, -1);

    for (int i = 0; i < s.length(); i++) {
      int idx = s.charAt(i) - 'a';
      if (alphabet[idx] == -1)
        alphabet[idx] = i;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      sb.append(alphabet[i]);
      if (i < 25)
        sb.append(' ');
    }
    System.out.println(sb);
  }
}