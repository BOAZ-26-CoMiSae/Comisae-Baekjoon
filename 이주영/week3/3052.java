import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Set<Integer> remainders = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(br.readLine());
      remainders.add(num % 42);
    }

    System.out.println(remainders.size());
  }
}