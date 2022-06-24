import java.util.Arrays;
import java.util.Scanner;

    public class InvertiStringa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string:");
            String a = sc.nextLine();
            reverseString(a);
        }

        private static void reverseString(String s) {
            String[] split = s.split(" ");
            int index = 0;
            String[] rev = new String[split.length]; //[ciao, come, va]
            for (int i = split.length - 1; i >= 0; i--) {
                rev[index++] = split[i];

            }
            System.out.println(Arrays.toString(rev));
        }

    }
