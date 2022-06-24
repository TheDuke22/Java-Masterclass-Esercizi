import java.util.Scanner;

public class PariDispari {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        checkEvenOdd(number);

    }
    private static void checkEvenOdd(int number) {
        if (number %2 !=0) // contorllo se e` pari o dispari e stampo
            System.out.println(number +" e` dispari");
        else System.out.println(number +" e` pari");
    }
}
