import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
//        palindrome
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter word");
        String word = input1.next().toLowerCase();
        boolean palindrome = true;
        int string = word.length();
        for (int i=0; i < string /2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println(word + " waa palindrome");
        } else {
            System.out.println(word + " ma aha palindrome");
        }

    }
}
