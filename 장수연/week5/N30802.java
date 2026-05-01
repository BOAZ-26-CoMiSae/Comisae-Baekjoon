package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sizes = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T =  Integer.parseInt(st.nextToken());
        int P =  Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < 6; i++) {
            count += sizes[i]/T;
            if(sizes[i]%T!=0){
                count +=1;
            }
        }
        System.out.println(count);
        System.out.println(N/P + " " + N%P);

    }
}
