package 조성빈.week1;

import java.util.Scanner;

public class 10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); 
            int W = sc.nextInt(); 
            int N = sc.nextInt(); 

            int floor; 
            int roomNum; 

            if (N % H == 0) {
                
                floor = H;
                roomNum = N / H;
            } else {
            
                floor = N % H;
                roomNum = (N / H) + 1;
            }

            
            System.out.printf("%d%02d\n", floor, roomNum);
        }
    }
}
