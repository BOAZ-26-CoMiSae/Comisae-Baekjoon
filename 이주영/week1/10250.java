import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            // int W = Integer.parseInt(st.nextToken()); // 사용 안 함
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            int y = N % H;

            if (y == 0) {
                y = H;
            }

            int x = (N - 1) / H + 1;

            // if (x < 10) {
            // sb.append(y).append(0).append(x);
            // } else {
            // sb.append(y).append(x);
            // }
            sb.append(y).append(String.format("%02d", x));

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
