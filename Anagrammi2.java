import java.util.Scanner;

public class Anagrammi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        int count =a.length();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j))
                    count++;

            }
        }
        if (count ==a.length()) System.out.println("anagramma");
        else System.out.println("non anagramma");
    }//potrei anche usare un contatore per ogni lettera per risolvere il problema delle lettere ripetute, ma troppo sbattimento
}

