import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod = 1;

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            prod *= num;
        }

        int[] arr = String.valueOf(prod)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        int[] counts = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }

        sc.close();
    }
}