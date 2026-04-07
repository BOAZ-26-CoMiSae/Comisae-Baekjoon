package 조성빈.week4;
import java.util Scanner;
import java.util.Arrays;

public class 10809 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int[] alphabet = new int[26];
    for(int i=0; i<alphabet.length; i++) {
        alphabe[i] = -1;
    }

    for (int i=0; i<s.length(); i++) {
        char ch = s.charAt(i);

        int index = ch - 'a';

        if(alphabet[index] == -1) {
            alphabet[index] = i;
        }
    }

    for(int val : alphabet) {
        System.out.print(val + " ");
    }
    sc.close();
}
}
