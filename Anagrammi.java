import java.util.Scanner;

public class Anagrammi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        if     ((a.charAt(0) == b.charAt(0) || a.charAt(0) == b.charAt(1) || a.charAt(0) == b.charAt(2)) &&
                (a.charAt(1) == b.charAt(0) || a.charAt(1) == b.charAt(1) || a.charAt(1) == b.charAt(2)) &&
                (a.charAt(2) == b.charAt(0) || a.charAt(2) == b.charAt(1) || a.charAt(2) == b.charAt(2)) && (a.length() == b.length()))
            System.out.println("e` un anagramma");
        else System.out.println("non e` un anagramma");

    }//troppe condizioni e bisogna aggiungere il tolowercase o ignorecase
}


