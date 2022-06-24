import java.util.Scanner;
import java.util.Arrays;

public class Anagrammi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }
    static void anagrams(String a, String b) {
        char [] arra= a.toLowerCase().toCharArray();
        char [] arrb= b.toLowerCase().toCharArray();
        Arrays.sort(arra);
        Arrays.sort(arrb);
        if (Arrays.equals(arra, arrb))
            System.out.println("anagramma");
        else System.out.println("non anagramma");
    }//GG WP
}