package week3;

import java.util.*;
import java.io.*;

public class N3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int cur = num % 42;
            arr[i] = cur;

        }
        Arrays.sort(arr);
        int temp = -1;
        for (int i = 0; i < 10; i++) {
            if (arr[i] != temp) {
                count++;
                temp = arr[i];

            }

        }
        System.out.println(count);
    }

}
