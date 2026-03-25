package 손채민;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 단어 받기 
        String str = br.readLine().trim();
        int n = 0;

        //공백 제거 후 빈문자열이 아닐때 갯수 세기
        if(!str.isEmpty()){
            n = str.split(" ").length;
        }

        System.out.println(n);
    }
}