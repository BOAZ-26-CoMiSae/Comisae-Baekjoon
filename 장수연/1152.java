import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        if (words.length == 0) {
            System.out.println(0);
        }
        else if (words[0].equals("")) {
            System.out.println(words.length - 1);
        }
        else {
            System.out.println(words.length);
        }

    }
}