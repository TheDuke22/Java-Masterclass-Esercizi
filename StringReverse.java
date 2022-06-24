import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        char[] split = s.toCharArray();
        int index = 0;
        char[] rev = new char[split.length];
        for (int i = split.length - 1; i >= 0; i--) {
            rev[index++] = split[i];
        }
        System.out.println(rev);
    }
}
 