// 알파벳 찾기 
package 남민서.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] alphabet = new int[26];

        // 배열의 모든 값을 -1로 초기화 
        for (int i = 0; i < 26; i ++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < s.length(); i ++) {
            
            int index = s.charAt(i) - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i = 0; i < 26; i ++) {
            System.out.print(alphabet[i] + " ");
        }

    }
}



// public class main10809 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         String s = br.readLine();

//         for (char c = 'a'; c <= 'z'; c++) {
//             System.out.print(s.indexOf(c) + " ");
//         }
//     }
// }