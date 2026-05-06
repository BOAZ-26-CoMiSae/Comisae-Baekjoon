package 조성빈.week2;

public class 10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        

        int first = sc.nextInt();
        int min = first;
        int max = first;


        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();
            
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }

        System.out.println(min + " " + max);
        
        sc.close();
    }
}
