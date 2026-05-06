package 남민서.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// HashSet
// 중복을 허용하지 않는 집합으로, 서로 다른 값 개수 구할 때는 HashSet쓰면 간단해짐  


public class main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num % 42);
        }
        
        System.out.println(set.size());
    }
}
