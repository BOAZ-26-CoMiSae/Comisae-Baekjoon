import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // testcase 갯수 입력 받기
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){

            String[] strArr = br.readLine().split("");
            // 공백 조심

            int a = Integer.parseInt(strArr[0]);
            String str = strArr[1]; 

            char[] chars = str.toCharArray();

            //StringBuilder 사용 + 배열
            StringBuilder sb = new StringBuilder();

            // 향상된 for문 ! (인덱스가 필요없는 순회에서 사용한다.)
            for(char c : chars){
                sb.append(String.valueOf(c).repeat(a));
            }
            System.out.println(sb); 

        }
    }
}