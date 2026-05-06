package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N;
        int count =0;
        for(int i=0;i<num;i++){
            N = Integer.parseInt(st.nextToken());

            if (N == 1) continue;

            boolean isPrime = true;

            for (int j = 2; j <= N; j++) {
                if (N % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);

    }

}
