package 조성빈.week5;
import java.util.Scanner;

public class 1978 {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int count = 0;        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); 
            
            if (num == 1) continue; // 17번 째 줄 2<1 오류가 생기기에 오류 발생 방지를 위해 설정 필요
            boolean isPrime = true; 

            for (int j = 2; j < num; j++) {
                if (num % j == 0) { 
                    isPrime = false; 
                    break;      // 소수가 아니라면 break 설정 후 11줄로 돌아가 다음 숫자 판별 진행
                }
            }
            if (isPrime) { 
                count++;   
            }
        }
        System.out.println(count);
        sc.close();
    }
}
