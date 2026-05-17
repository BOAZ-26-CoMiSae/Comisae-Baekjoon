package 조성빈.week5;
import java.util.Scanner;

public class 2231 {
    public static void main(String[] args) {
    Scanner sc = new scanner(System.in);
    int N = sc.nextInt();
    int result = 0;

    for(int i=1; i<N; i++) {
        int number = i;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if(suum + i == N) {
            result = i;
            break;
        }
    }
    System.out.println(result);
    sc.close();
    }
}
