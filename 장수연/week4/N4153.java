package week4;

import java.io.*;
import java.util.*;
public class N4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            if(str.equals("0 0 0")){
                break;
            }
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if((arr[0])*(arr[0])+(arr[1])*(arr[1]) == arr[2]*arr[2]){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }


    }

}
