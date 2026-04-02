package 남민서.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class main2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());   // 하나씩 꺼내서 배열에 저장
        }

        boolean isAscending = true;    // 오름차순
        boolean isDescending = true;   // 내림차순 

        for (int i = 0; i < 7; i++) {
            if (arr[i] > arr[i+1]) isAscending = false;
            if (arr[i] < arr[i+1]) isDescending = false;
        }

        if (isAscending) System.out.println("ascending");
        else if (isDescending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
