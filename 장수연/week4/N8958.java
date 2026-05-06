package week4;

import java.io.*;

public class N8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int score = 0;
            int count = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    score = score + count;
                }else if (str.charAt(j) == 'X') {
                    count = 0;
                }
            }

            System.out.println(score);
        }


    }

}
