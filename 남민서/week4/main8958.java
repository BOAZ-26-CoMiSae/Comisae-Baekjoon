// OX 퀴즈 
package 남민서.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class main8958 {
//         public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(br.readLine());

//         for (int i = 0; i < n; i ++) {
//             String s = br.readLine(); 

//             int count = 0;    // 연속 O 개수 
//             int sum = 0;      // 총 점수

//             for (int j = 0; j < s.length(); j ++) {
//                 if (s.charAt(j) == 'O') {     // 문자열에서 인덱스 n번째 글자를 가져옴
//                     count ++;
//                     sum += count;
//                 } else {
//                     count = 0;
//                 }
//             }
//             System.out.println(sum);
//         }

//     }    
// }


public class main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
    }
}