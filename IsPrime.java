public class IsPrime {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number) + " 631");
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
        number = 19;
        System.out.println(isPrime(number));
        number = 22;
        System.out.println(isPrime(number));
        number = 159;
        System.out.println(isPrime(number));
        number = 1691;
        System.out.println(isPrime(number));
        number = 2861;
        System.out.println(isPrime(number));


    }


    private static boolean isPrime(int number) {  //controllo se il resto diviso "i" e` uguale a 0.
        for (int i = 3; i < number/2; i=i+2) {    //ottimizzato(?) togliendo multipli di 2 e meta`number
            if (number % 2==0)
                return false;
            else if (number % i==0)
                return false;
        }
        return true;
    }
}