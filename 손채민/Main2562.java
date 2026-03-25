package 손채민;
/*
최댓값(브론즈)
*/

import java.io.*;  // 이거 공간복잡도 ? 

public class Main2562{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxVal = 0;
        int maxIdx = 0;

        for (int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            if (num>maxVal){
                maxVal=num;
                maxIdx=i;
            } 
        }

        System.out.println(maxVal);
        System.out.println(maxIdx+1);
    }
}

