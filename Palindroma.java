import java.util.Arrays;

public class Palindroma { public static void main(String[] args) {
    System.out.println(isPalindrome("c"));
    System.out.println(isPalindrome("ciic"));
    System.out.println(isPalindrome("aaaa"));
    System.out.println(!isPalindrome("absca"));
    System.out.println(!isPalindrome("abbaa"));
    System.out.println(isPalindrome("zzzzz"));
    System.out.println(isPalindrome("zzczz"));
    System.out.println(isPalindrome("aabbaa"));
    System.out.println(isPalindrome("itopinonavevanonipoti"));
}

    private static boolean isPalindrome(String s) {
    char [] reverse = new char [s.length()];
    //char [] compare = s.toCharArray();
    int index = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            reverse[index] = s.charAt(i);
            index++;
        }
        //System.out.println(s);
        //System.out.println(compare);
        //System.out.println(Arrays.toString(reverse));
        if (s.contentEquals(reverse.toString()))
            return  false;
        else return  true; // non capisco perche` devo invertire true e false


    }

}
