package 조성빈.week4;
import java.util.Scanner;

public class 4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==0 && b==0 && c==0) {
            break;
        }

        if( a*a + b*b == c*c ) ||
        if( c*c + a*a == c*c ) ||
        if( c*c + b*b == a*a ) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
        sc.close();
    }
}
