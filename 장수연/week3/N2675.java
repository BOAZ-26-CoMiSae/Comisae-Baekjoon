package week3;

import java.io.*;
import java.util.*;

class N2675 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for(int j =0; j<S.length(); j++){
                for(int k=0; k<num; k++){
                    sb.append(S.charAt(j));
                }
            }
            System.out.println(sb);
        }


    }
}