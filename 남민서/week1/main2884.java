import java.util.Scanner;

public class main2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            m = m - 45;
        } else {
            if (h ==0) {
                h = 23;
            } else {
                h = h - 1;
            }
            m = m + 15;
        }

        System.out.println(h + " " + m);
    }
}
