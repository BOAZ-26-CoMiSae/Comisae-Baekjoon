package week4;

import java.io.*;

public class N10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] charArr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for(int i =0; i <26; i++){
            arr[i] = -1;
        }
        for(int i=0;i<charArr.length;i++){
            if (arr[charArr[i]-'a'] == -1){
                arr[charArr[i]-'a'] = i;
            }
        }

        for(int i=0;i<26;i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);


    }

}
