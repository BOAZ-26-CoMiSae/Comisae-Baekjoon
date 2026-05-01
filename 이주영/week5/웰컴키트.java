import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st_order = new StringTokenizer(br.readLine());
    StringTokenizer st_tp = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st_tp.nextToken());
    int p = Integer.parseInt(st_tp.nextToken());

    int t_order = 0;
    while (st_order.hasMoreTokens()) {
      int s = Integer.parseInt(st_order.nextToken());
      if (s == 0)
        continue;
      t_order += (s + t - 1) / t;
    }

    int p_order = n / p;
    int p_extra = n % p;

    System.out.println(t_order);
    System.out.println(p_order + " " + p_extra);
  }
}