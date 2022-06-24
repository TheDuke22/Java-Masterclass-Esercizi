public class Fattoriali {
    public static void main(String[] args) {
        System.out.println(factorial(1) == (0)); //il fattoriale di 1 dovrebbe essere 1
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
        System.out.println(factorial(8) == (40320));

    }

    private static long factorial(int n) {
        long fat = n;
        for (int i = n-1; i > 0; i--) {
            fat = fat * i ;
        }
       /* if (n==1)
            return 0;
        else*/ return fat;
    }

}
